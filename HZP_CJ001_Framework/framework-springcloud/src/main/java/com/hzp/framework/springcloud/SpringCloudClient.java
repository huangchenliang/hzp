package com.hzp.framework.springcloud;

import com.hzp.framework.common.ErrorCodeConst;
import com.hzp.framework.common.exception.HzpRuntimeException;
import com.hzp.framework.common.exception.RestServiceException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaolei
 * @create 2016-09-12 10:16
 */
@Component
public class SpringCloudClient
{
    private static Log log = LogFactory.getLog(SpringCloudClient.class);

    @Autowired
    private RestTemplate restTemplate;

    public String get(String serviceUrl) throws RestClientException
    {
        String result = null;
        try
        {
            return restTemplate.getForObject(serviceUrl, String.class);
        }
        catch (RestClientException e)
        {
            log.error("It occured error excuting SpringCloudClient.get Case:" + e.getMessage());
            throw new RestServiceException(ErrorCodeConst.SERVER_RESEST_EXCEPTION, e);
        }

    }

    public String post(String serviceUrl, String jsonStr) throws RestClientException
    {
        try
        {
            return restTemplate.postForObject(serviceUrl, jsonStr, String.class);
        }
        catch (RestClientException e)
        {
            log.error("It occured error excuting SpringCloudClient.post Case:" + e.getMessage());
            throw new RestServiceException(ErrorCodeConst.SERVER_RESEST_EXCEPTION, e);
        }
    }
}
