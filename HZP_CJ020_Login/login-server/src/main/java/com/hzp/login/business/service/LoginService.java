package com.hzp.login.business.service;

import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.login.vo.LoginVO;

/**
 * @Description: 用户登录业务逻辑处理
 * @author: Jerry
 * @date: 2017/4/21
 */
public interface LoginService
{
    /**
     * 用户登录
     * @param loginVO 登录信息
     * @throws HzpRuntimeException 业务逻辑异常
     */
    void login(LoginVO loginVO) throws HzpRuntimeException;
}
