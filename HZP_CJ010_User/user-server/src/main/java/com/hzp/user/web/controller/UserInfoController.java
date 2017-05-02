package com.hzp.user.web.controller;

import com.hzp.framework.base.BaseController;
import com.hzp.framework.common.Constants;
import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.framework.common.util.BeanUtils;
import com.hzp.framework.common.util.JsonUtils;
import com.hzp.user.business.service.UserInfoService;
import com.hzp.user.dto.UserInfoDTO;
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
        List<UserInfoDTO> userInfoDTOList = new ArrayList<>();
        for(UserInfo userInfo : userInfoList)
        {
            UserInfoDTO userInfoDTO = new UserInfoDTO();
            BeanUtils.copyProperties(userInfo, userInfoDTO);
            userInfoDTOList.add(userInfoDTO);
        }
        return super.getResultJSONStr(true, userInfoDTOList, "");
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

    /**
     * 根据用户编号获取用户信息
     * @return 符合条件的用户信息
     */
    @RequestMapping(value = "/getUserByUserNo", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    public String getUserByUserNo(@RequestBody String jsonStr)
    {
        UserInfoVO userInfoVO = super.getFormJSON(jsonStr, UserInfoVO.class);
        try
        {
            UserInfoDTO userInfoDTO = userInfoService.getUserByUserNo(userInfoVO);
            return super.getResultJSONStr(true, userInfoDTO, "");
        }
        catch (HzpRuntimeException e)
        {
            return super.getResultJSONStr(false, "", e.getErrorCode());
        }
    }

    /**
     * 根据手机获取用户信息
     * @return 符合条件的用户信息
     */
    @RequestMapping(value = "/getUserByPhone", produces = Constants.APPLICATION_JSON_CHARSET_UTF8)
    public String getUserByPhone(@RequestBody String jsonStr)
    {
        UserInfoVO userInfoVO = super.getFormJSON(jsonStr, UserInfoVO.class);
        try
        {
            UserInfoDTO userInfoDTO = userInfoService.getUserByPhone(userInfoVO);
            return super.getResultJSONStr(true, userInfoDTO, "");
        }
        catch (HzpRuntimeException e)
        {
            return super.getResultJSONStr(false, "", e.getErrorCode());
        }
    }

}
