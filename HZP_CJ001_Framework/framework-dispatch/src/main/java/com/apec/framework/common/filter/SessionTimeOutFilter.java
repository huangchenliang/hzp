package com.apec.framework.common.filter;

import com.apec.framework.cache.CacheService;
import com.apec.framework.common.Constants;
import com.apec.framework.common.ErrorCodeConst;
import com.apec.framework.common.ResultData;
import com.apec.framework.common.constants.LoginConstants;
import com.apec.framework.common.exception.ApecRuntimeException;
import com.apec.framework.common.util.JsonUtil;
import com.apec.framework.common.util.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类 编 号：
 * 类 名 称：SessionTimeOutFilter
 * 内容摘要：处理session超时
 * 完成日期：
 * 编码作者：
 */
@Component("sessionTimeOutFilter")
public class SessionTimeOutFilter implements Filter
{

    private static final Log log = LogFactory.getLog( SessionTimeOutFilter.class );

    @Value("${allowUrls}")
    private String allowUrls;

    @Value("${repeatSubmitUrl}")
    private String repeatSubmitUrl;

    @Autowired
    private CacheService cacheService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException
    {
        HttpServletRequest servletRequest = (HttpServletRequest)request;
        HttpServletResponse servletResponse = (HttpServletResponse)response;
        HttpSession session = servletRequest.getSession();
        String type = servletRequest.getHeader( Constants.CLIENT_TYPE_PARAM );
        String url = servletRequest.getRequestURI();
        String sessionId = session.getId();
        boolean isPass = true; //如果session超时则不调用服务，默认为通过
        boolean isRepeat = true; //是否为重复提交
        if(allowUrls.contains( url ))
        {
            session.setAttribute( Constants.SESSION_ID, sessionId );
        }
        else
        {
            if(Constants.ANDROID.equals( type ) || Constants.IOS.equals( type ))
            {
                servletRequest.setAttribute( Constants.CLIENT_TYPE_PARAM, type );
                String ua = servletRequest.getHeader( Constants.UA ); //版本号：手机相关信息
                String imei = servletRequest.getHeader( Constants.IMEI );//设备号

                servletRequest.setAttribute( Constants.UA, ua );
                servletRequest.setAttribute( Constants.IMEI, imei );

                isPass = appLogTimeOut( servletRequest, servletResponse );
                isRepeat = appRepeatAction( servletRequest, servletResponse );
            }
            else
            {
                servletRequest.setAttribute( Constants.CLIENT_TYPE_PARAM, Constants.WEB );
                isPass = webLogTimeOut( servletResponse, sessionId, servletRequest );
                isRepeat = webRepeatAction( servletResponse, sessionId, servletRequest );
            }
        }
        if(isPass && isRepeat)
        {

            chain.doFilter( request, response );
        }

    }

    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub

    }

    /**
     * 处理app端session超时处理
     * @param request 请求request
     * @param response 响应数据
     */
    private boolean appLogTimeOut(HttpServletRequest request, HttpServletResponse response)
    {
        String token = request.getHeader( Constants.TOKEN );
        log.info( "sessionTimeOutFilter.webLogTimeOut appLogTimeOut:token" + token );
        if(StringUtils.isBlank( token ))
        {
            return false;
        }
        String tokenKey = LoginConstants.PREFIX_TOKEN + token;
        String userNo = cacheService.get( tokenKey );
        log.info( "sessionTimeOutFilter.webLogTimeOut appLogTimeOut:userNo" + userNo );
        return handleSessionInfo( response, userNo, request );
    }

    /**
     * app 端重复提交处理
     * @param req 请求request
     * @param res 响应数据
     */
    private boolean appRepeatAction(HttpServletRequest req, HttpServletResponse res)
    {
        String token = req.getHeader( Constants.TOKEN );
        String duplicateKey = Constants.PREFIX_REPEAT + token;
        return isRepeatSubmit( duplicateKey, req, res );
    }

    /**
     * 处理H5端session超时
     * @param response 响应数据
     * @param sessionId 当前sessionId
     * @param request  当前请求信息
     */
    private boolean webLogTimeOut(HttpServletResponse response, String sessionId, HttpServletRequest request)
    {

        log.info( "sessionTimeOutFilter.webLogTimeOut sessionId:" + sessionId );
        String sessionKey = LoginConstants.PREFIX_SESSIONID + sessionId;
        String userNo = cacheService.get( sessionKey );
        log.info( "sessionTimeOutFilter.webLogTimeOut userNo:" + userNo );
        if(handleSessionInfo( response, userNo, request ))
        {
            cacheService.expire( sessionKey, 120 );
            return true;
        }
        return false;
    }

    /**
     * web端重复提交处理
     * @param res 响应数据
     * @param sessionId 当前sessionId
     * @param req 当前请求信息
     */
    private boolean webRepeatAction(HttpServletResponse res, String sessionId, HttpServletRequest req)
    {
        String sessionKey = LoginConstants.PREFIX_SESSIONID + sessionId;
        String userNo = cacheService.get( sessionKey );
        String duplicateKey = Constants.PREFIX_REPEAT + userNo;
        return isRepeatSubmit( duplicateKey, req, res );
    }

    /**
     * 设置session超时信息
     * @param response 响应信息
     * @param userNo 用户编号
     * @param request request 当前请求信息
     */
    private boolean handleSessionInfo(HttpServletResponse response, String userNo, HttpServletRequest request)
    {
        log.info( "sessionTimeOutFilter.handleSessionInfo userNo:" + userNo );
        ResultData<Object> resultData = new ResultData<>();
        if(StringUtils.isBlank( userNo ))
        {
            try
            {
                PrintWriter out = response.getWriter();
                resultData.setErrorCode( ErrorCodeConst.ERROR_600001 );
                resultData.setErrorMsg( SpringUtil.getMessage( ErrorCodeConst.ERROR_600001 ) );
                resultData.setSucceed( false );
                out.print( JsonUtil.toJSONString( resultData ) );
                out.close();
            }
            catch (IOException e)
            {
                log.error( "sessionTimeOutFilter.handleSessionInfo exception case:" + e.getMessage() );
                throw new ApecRuntimeException( "sessionTimeOutFilter.handleSessionInfo exception case:", e );
            }
            return false;
        }
        else
        {
            String userInfoJson = cacheService.get( Constants.CACHE_USERINFO_PREFIX + userNo );
            request.setAttribute( Constants.USER_NO, userNo );
            request.setAttribute( Constants.USER_INFO, userInfoJson );
            return true;
        }
    }

    /**
     * 重复提交
     * @param repeatKey 重复提交建
     * @param request 请求信息
     * @return true/false
     */
    private boolean isRepeatSubmit(String repeatKey, HttpServletRequest request, HttpServletResponse response)
    {
        String url = request.getRequestURI();
        if(repeatSubmitUrl.contains( url ))
        {
            String clientRepeat = request.getParameter( Constants.CLIENT_DUPLICATE_ACT_PARAM );
            String serverRepeat = cacheService.get( repeatKey );
            if(StringUtils.isBlank( serverRepeat ))
            {
                cacheService.add( repeatKey, clientRepeat );
                return true;
            }
            if(serverRepeat.equals( clientRepeat ))
            {
                try
                {
                    ResultData<Object> resultData = new ResultData<>();
                    PrintWriter out = response.getWriter();
                    resultData.setErrorCode( ErrorCodeConst.ERROR_600004 );
                    resultData.setErrorMsg( SpringUtil.getMessage( ErrorCodeConst.ERROR_600004 ) );
                    resultData.setSucceed( false );
                    resultData.setRepeatAct( serverRepeat );
                    out.print( JsonUtil.toJSONString( resultData ) );
                    out.close();
                }
                catch (IOException e)
                {
                    log.error( "sessionTimeOutFilter.isRepeatSubmit case:" + e.getMessage() );
                    throw new ApecRuntimeException( "sessionTimeOutFilter.isRepeatSubmit case:", e );
                }
                return false;
            }
            cacheService.add( repeatKey, clientRepeat );
        }
        return true;

    }
}
