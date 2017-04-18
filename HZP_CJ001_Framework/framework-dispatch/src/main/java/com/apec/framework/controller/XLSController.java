package com.apec.framework.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apec.framework.base.BaseController;
import com.apec.framework.base.IJSONService;
import com.apec.framework.common.ResultData;
import com.apec.framework.common.excel.CodeDealUtils;
import com.apec.framework.common.excel.XlsVO;
import com.apec.framework.common.exception.DispatchException;
import com.apec.framework.common.util.FileUtil;
import com.apec.framework.common.util.JsonUtil;


/**
 * 类 编 号：
 * 类 名 称：XLSController 
 * 内容摘要：PDF、excel 导出
 * 请求信息 
 * 创建日期：2017/2/6 
 * 编码作者：
 */
@RestController
public class XLSController extends BaseController {

	@Autowired
	private IJSONService dispatchJSONService;
	   
	@RequestMapping(value = "/{serverName}/{methodName}.xls")
	public void dispatchRequest(@PathVariable("serverName") String serverName,
			@PathVariable("methodName") String methodName, HttpServletRequest request,HttpServletResponse res) throws IOException {
		String ret = sendRequest(request, serverName, methodName);
		if(StringUtils.isEmpty(ret)) {
			return;
		}
		ResultData resultData = JsonUtil.parseObject(ret, ResultData.class);
		if(!resultData.isSucceed() || null == resultData.getData()) {
			return;
		}
		XlsVO object = JsonUtil.parseObject(resultData.getData().toString(), XlsVO.class);
		if(null == object) {
			return;
		}
		String url = object.getUrl();
		String fileName = CodeDealUtils.encodeFilename(object.getFileName(), request);
		FileUtil.downloadFile(res, fileName, url);
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