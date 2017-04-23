package com.hzp.user.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hzp.framework.base.BaseController;
import com.hzp.framework.common.Constants;
import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.framework.common.util.JsonUtils;
import com.hzp.user.business.service.UserInfoService;
import com.hzp.user.model.UserInfo;
import com.hzp.user.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    @RequestMapping(value = "/queryAll", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    public String queryAll()
    {
        List<UserInfo> userInfoList = userInfoService.queryAll();
        return super.getResultJSONStr(true, userInfoList, "");
    }

    /**
     * 根据条件查询用户信息
     * @return 符合条件的用户信息集合
     */
    @RequestMapping(value = "/queryByCondition", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    public String queryByCondition(@RequestBody String jsonStr)
    {
        UserInfoVO userInfoVO = super.getFormJSON(jsonStr, UserInfoVO.class);
        List<UserInfo> userInfoList = userInfoService.queryByCondition(userInfoVO);
        return super.getResultJSONStr(true, userInfoList, "");
    }

    /**
     * 根据条件查询用户信息
     * @return 符合条件的用户信息集合
     */
    @RequestMapping(value = "/add", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    public String add(@RequestBody String jsonStr)
    {
        UserInfoVO userInfoVO = super.getFormJSON(jsonStr, UserInfoVO.class);
        try
        {
            userInfoService.add(userInfoVO);
        }
        catch (HzpRuntimeException e)
        {
            return super.getResultJSONStr(false, "", e.getErrorCode());
        }
        return super.getResultJSONStr(true, "", "");
    }
}
