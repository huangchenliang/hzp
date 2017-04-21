package com.hzp.user.business.service.impl;

import com.hzp.framework.base.BaseDomainService;
import com.hzp.user.access.dao.UserInfoDAO;
import com.hzp.user.business.service.UserInfoService;
import com.hzp.user.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: UserInfoService具体业务实现
 * @author: Jerry
 * @date: 2017/4/21
 */
@Service
public class UserInfoServiceImpl extends BaseDomainService implements UserInfoService
{

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public List<UserInfo> queryAll()
    {
        return userInfoDAO.findAll();
    }
}
