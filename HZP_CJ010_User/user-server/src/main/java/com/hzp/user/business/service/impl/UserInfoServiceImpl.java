package com.hzp.user.business.service.impl;

import com.hzp.framework.base.BaseDomainService;
import com.hzp.framework.common.ErrorCodeConst;
import com.hzp.framework.common.enumtype.EnableFlag;
import com.hzp.framework.common.exception.DAOException;
import com.hzp.framework.common.exception.DomainServiceException;
import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.framework.common.util.BeanUtils;
import com.hzp.framework.jpa.common.tools.SqlFilter;
import com.hzp.user.access.dao.UserInfoDAO;
import com.hzp.user.business.service.UserInfoService;
import com.hzp.user.model.QUserInfo;
import com.hzp.user.model.UserInfo;
import com.hzp.user.vo.UserInfoVO;
import com.mysema.query.types.Predicate;
import com.mysema.query.types.expr.BooleanExpression;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description: UserInfoService具体业务实现
 * @author: Jerry
 * @date: 2017/4/21
 */
@Service
public class UserInfoServiceImpl extends BaseDomainService implements UserInfoService
{
    private static Log log = LogFactory.getLog(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public List<UserInfo> queryAll()
    {
        return userInfoDAO.findAll();
    }

    @Override
    public List<UserInfo> queryByCondition(UserInfoVO UserInfoVO)
    {
        List<UserInfo> userInfoList = (List<UserInfo>)userInfoDAO.findAll(getInputCondition(UserInfoVO));
        if(CollectionUtils.isNotEmpty(userInfoList))
        {
            return userInfoList;
        }
        return null;
    }

    /**
     * 多条件查询用户信息
     * @param userInfoVO 查询条件
     */
    private Predicate getInputCondition(UserInfoVO userInfoVO)
    {
        List<BooleanExpression> predicates = new ArrayList<>();
        if(Objects.nonNull(userInfoVO))
        {
            if(StringUtils.isNotBlank(userInfoVO.getUserNo()))
            {
                predicates.add(QUserInfo.userInfo.userNo.eq(userInfoVO.getUserNo()));
            }
            if(StringUtils.isNotBlank(userInfoVO.getPhone()))
            {
                predicates.add(QUserInfo.userInfo.phone.eq(userInfoVO.getPhone()));
            }
            if(StringUtils.isNotBlank(userInfoVO.getUserName()))
            {
                predicates.add(QUserInfo.userInfo.userName.like(SqlFilter.filterForLike(userInfoVO.getUserName()),
                                                                SqlFilter.DEFALT_ESCAPE_CHAR));
            }
        }
        predicates.add(QUserInfo.userInfo.enableFlag.eq(EnableFlag.Y));
        return BooleanExpression.allOf(predicates.toArray(new BooleanExpression[predicates.size()]));
    }

    @Override
    public void add(UserInfoVO userInfoVO) throws HzpRuntimeException
    {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoVO, userInfo);
        try
        {
            userInfoDAO.save(userInfo);
        }
        catch (Exception e)
        {
            log.error("It occured error in excuting UserInfoServiceImpl.add DB case:" + e.getMessage());
            throw new DomainServiceException(ErrorCodeConst.DAO_DELETE_EXCEPTION, e);
        }
    }
}
