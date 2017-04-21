package com.hzp;

import com.hzp.framework.base.BaseApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserInfoApplication extends BaseApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(UserInfoApplication.class).web(true).run(args);
    }
}
