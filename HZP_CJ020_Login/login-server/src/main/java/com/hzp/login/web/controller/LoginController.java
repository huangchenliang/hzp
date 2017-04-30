package com.hzp.login.web.controller;

import com.hzp.framework.base.BaseController;
import com.hzp.framework.common.Constants;
import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.login.business.service.LoginService;
import com.hzp.login.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息处理
 */
@RestController
public class LoginController extends BaseController
{

    @Autowired
    private LoginService loginService;

    /**
     * 查询所有用户信息
     *
     * @return 前端所需要的信息格式
     */
    @RequestMapping(value = "/login", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    public String login(@RequestBody String jsonStr)
    {
        LoginVO loginVO = super.getFormJSON(jsonStr, LoginVO.class);
        try
        {
            loginService.login(loginVO);
            return super.getResultJSONStr(true, "", "");
        }
        catch (HzpRuntimeException e)
        {
            return super.getResultJSONStr(true, "", e.getErrorCode());
        }

    }
    //
    //    /**
    //     * 根据条件查询用户信息
    //     * @return 符合条件的用户信息集合
    //     */
    //    @RequestMapping(value = "/queryByCondition", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    //    public String queryByCondition(@RequestBody String jsonStr)
    //    {
    //        UserInfoVO userInfoVO = super.getFormJSON(jsonStr, UserInfoVO.class);
    //        List<UserInfo> userInfoList = userInfoService.queryByCondition(userInfoVO);
    //        return super.getResultJSONStr(true, userInfoList, "");
    //    }
    //
    //    /**
    //     * 根据条件查询用户信息
    //     * @return 符合条件的用户信息集合
    //     */
    //    @RequestMapping(value = "/add", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    //    public String add(@RequestBody String jsonStr)
    //    {
    //        UserInfoVO userInfoVO = super.getFormJSON(jsonStr, UserInfoVO.class);
    //        try
    //        {
    //            userInfoService.add(userInfoVO);
    //        }
    //        catch (HzpRuntimeException e)
    //        {
    //            return super.getResultJSONStr(false, "", e.getErrorCode());
    //        }
    //        return super.getResultJSONStr(true, "", "");
    //    }
    //
    //    /**
    //     * 根据用户编号获取用户信息
    //     * @return 符合条件的用户信息集合
    //     */
    //    @RequestMapping(value = "/getUserByUserNo", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    //    public String getUserByUserNo(@RequestBody String jsonStr)
    //    {
    //        UserInfoVO userInfoVO = super.getFormJSON(jsonStr, UserInfoVO.class);
    //        try
    //        {
    //            UserInfoDTO userInfoDTO = userInfoService.getUserByUserNo(userInfoVO);
    //            return super.getResultJSONStr(true, userInfoDTO, "");
    //        }
    //        catch (HzpRuntimeException e)
    //        {
    //            return super.getResultJSONStr(false, "", e.getErrorCode());
    //        }
    //    }

}
