package com.hzp.user.business.service;

import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.user.dto.UserInfoDTO;
import com.hzp.user.model.UserInfo;
import com.hzp.user.vo.UserInfoVO;

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

    /**
     * 根据条件查询用户信息
     * @param userInfoVO 查询条件
     * @return 符合条件的用户信息
     */
    List<UserInfo> queryByCondition(UserInfoVO userInfoVO);

    /**
     * 新增用户信息
     * @param userInfoVO 用户信息
     */
    void add(UserInfoVO userInfoVO) throws HzpRuntimeException;

    /**
     * 根据用户编号获取用户信息
     * @param userInfoVO 用户编号
     * @return 封装的用户信息
     */
    UserInfoDTO getUserByUserNo(UserInfoVO userInfoVO) throws HzpRuntimeException;

    /**
     * 根据手机号码查询用户信息
     * @param userInfoVO 用户手机号码
     * @return 用户信息
     * @throws HzpRuntimeException 业务异常
     */
    UserInfoDTO getUserByPhone(UserInfoVO userInfoVO) throws HzpRuntimeException;
}
