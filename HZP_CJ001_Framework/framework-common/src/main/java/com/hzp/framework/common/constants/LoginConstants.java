package com.hzp.framework.common.constants;

public interface LoginConstants
{
    /**
     * 登陆服务名
     */
    String LOGIN_SERVER = "LOGIN-SERVICE";
    
    /**
     * 登陆方法，参数：LogonAccount、LogonPassword
     */
    String METHOD_DOLOGIN = "doLogin";
    
    /**
     * 校验登陆状态，参数：userNo、token
     */
    String METHOD_VALIDATATOKEN = "validateToken";
    

    String PREFIX_TOKEN_USERNO = "token_userNo_";
    
    String PREFIX_TOKEN = "token_";
    
    String PREFIX_SESSIONID = "sessionId_";
}
