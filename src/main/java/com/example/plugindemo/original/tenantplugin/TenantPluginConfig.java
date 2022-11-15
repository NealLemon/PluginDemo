package com.example.plugindemo.original.tenantplugin;

import com.example.plugindemo.base.sample.SayHelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:30
 * @Description:
 * @Version 1.0.0
 */
@Configuration
public class TenantPluginConfig {
    
    @Bean
    public SayHelloWorld sayHelloWorldTenantPlugin() {
        return new SayHelloWorldTenantPlugin();
    }

}
