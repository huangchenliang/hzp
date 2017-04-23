package com.hzp.user.access.dao;

import com.hzp.framework.common.enumtype.EnableFlag;
import com.hzp.framework.jpa.dao.BaseDAO;
import com.hzp.user.model.UserInfo;

/**
 * @Description: 用户信息数据库操作
 * @author: Jerry
 * @date: 2017/4/21
 */
public interface UserInfoDAO extends BaseDAO<UserInfo, Long>
{
    /**
     * 根据用户编号查询有效的用户信息
     * @param userNO 用户编号
     * @param enableFlag 是否删除
     * @return 用户信息
     */
    UserInfo findByUserNoAndEnableFlag(String userNO, EnableFlag enableFlag);
}
