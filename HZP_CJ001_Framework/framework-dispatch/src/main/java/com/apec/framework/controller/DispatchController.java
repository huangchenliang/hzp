package com.apec.framework.controller;

import com.apec.framework.base.BaseController;
import com.apec.framework.base.IJSONService;
import com.apec.framework.common.Constants;

import com.apec.framework.common.exception.DispatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 类 编 号：
 * 类 名 称：DispatchController
 * 内容摘要：请求分发控制器
 * 完成日期：
 * 编码作者：
 */
@RestController

public class DispatchController extends BaseController
{

    @Autowired
    private IJSONService dispatchJSONService;

    /**
     * 请求分发
     * @param serverName 服务名称
     * @param methodName 调用方法名
     * @param request 请求信息
     * @return 请求返回结果
     */
    @RequestMapping(value = "/{serverName}/{methodName}.apec", produces = "application/json;charset=UTF-8")
    public String dispatchRequest(@PathVariable("serverName") String serverName,
        @PathVariable("methodName") String methodName, HttpServletRequest request)
    {
        return sendRequest( request, serverName, methodName );
    }

    /**
     * 请求分发
     * @param serverName 服务名称
     * @param methodName 调用方法名
     * @param fileName 文件名称
     * @param request 请求信息
     * @return 请求返回结果
     */
    @RequestMapping(value = "/{serverName}/{fileName}/{methodName}.apec", produces = "application/json;charset=UTF-8")
    public String dispatchRequest(@PathVariable("serverName") String serverName,
        @PathVariable("fileName") String fileName, @PathVariable("methodName") String methodName,
        HttpServletRequest request)
    {
        return sendRequest( request, serverName, fileName + Constants.SINGLE_SLASH + methodName );
    }

    /**
     * 发送请求
     * @param request 请求
     * @param methodName 调用方法名
     * @param serverName 服务名称
     * @return 请求返回结果
     */
    private String sendRequest(HttpServletRequest request, String serverName, String methodName)
    {
        String ret;
        try
        {
            ret = dispatchJSONService.service( serverName, methodName, request );
        }
        catch (DispatchException e)
        {
            return super.getResultJSONStr( false, "", e.getErrorCode() );
        }
        return ret;

    }
}
