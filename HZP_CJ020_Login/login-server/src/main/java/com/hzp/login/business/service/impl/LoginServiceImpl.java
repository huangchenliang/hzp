package com.hzp.login.business.service.impl;

import com.hzp.framework.base.BaseDomainService;
import com.hzp.framework.common.ErrorCodeConst;
import com.hzp.framework.common.ResultData;
import com.hzp.framework.common.exception.BusinessException;
import com.hzp.framework.common.exception.DomainServiceException;
import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.framework.common.util.JsonUtils;
import com.hzp.framework.springcloud.SpringCloudClient;
import com.hzp.login.business.service.LoginService;
import com.hzp.login.dto.LoginDTO;
import com.hzp.login.vo.LoginVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import java.util.Objects;

/**
 * @Description: UserInfoService具体业务实现
 * @author: Jerry
 * @date: 2017/4/21
 */
@Service
public class LoginServiceImpl extends BaseDomainService implements LoginService
{
    private static Log log = LogFactory.getLog(LoginServiceImpl.class);

    @Autowired
    private SpringCloudClient springCloudClient;

    @Value("${get_user_by_phone_url}")
    private String get_user_by_phone_url;

    @Override
    public void login(LoginVO loginVO) throws HzpRuntimeException
    {
        if(Objects.isNull(loginVO) || StringUtils.isBlank(loginVO.getPhone()))
        {
            throw new BusinessException(ErrorCodeConst.PHONE_NOT_NULL);
        }
        if(StringUtils.isBlank(loginVO.getValidateCode()))
        {
            throw new BusinessException(ErrorCodeConst.VALIDATE_CODE_NOT_NULL);
        }
        LoginDTO loginDTO = getUserInfoByPhone(loginVO.getPhone());

    }

    /**
     * 根据手机号查询用户信息
     * @param phone 手机号码
     * @return 用户信息
     * @throws HzpRuntimeException 异常处理
     */
    private LoginDTO getUserInfoByPhone(String phone) throws HzpRuntimeException
    {
        String resultJson = springCloudClient.post(get_user_by_phone_url, phone);
        ResultData<LoginDTO> resultData = JsonUtils.parseObject(get_user_by_phone_url, ResultData.class);
        if(!resultData.isSucceed())
        {
            log.error("request user info by phone :in>" + phone + " out>" + resultJson);
            throw new BusinessException(resultData.getErrorCode());
        }
        return resultData.getData();
    }
}
