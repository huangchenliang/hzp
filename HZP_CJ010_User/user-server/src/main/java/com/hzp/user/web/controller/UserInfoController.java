package com.hzp.user.web.controller;

import com.hzp.framework.base.BaseController;
import com.hzp.user.business.service.UserInfoService;
import com.hzp.user.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息处理
 */
@RestController
public class UserInfoController extends BaseController
{

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 查询所有用户信息
     *
     * @return 前端所需要的信息格式
     */
    @RequestMapping(value = "/queryAll", produces = "application/json;charset=UTF-8")
    public String queryAll()
    {
        List<UserInfo> userInfoList = userInfoService.queryAll();
        return super.getResultJSONStr(true, userInfoList, "");
    }
}
