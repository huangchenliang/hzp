package com.hzp.user.business.service;

import com.hzp.user.model.UserInfo;

import java.util.List;

/**
 * @Description: 用户信息业务逻辑处理
 * @author: Jerry
 * @date: 2017/4/21
 */
public interface UserInfoService
{

    /**
     * 查询所有用户信息
     *
     * @return 用户信息集合
     */
    List<UserInfo> queryAll();
}
