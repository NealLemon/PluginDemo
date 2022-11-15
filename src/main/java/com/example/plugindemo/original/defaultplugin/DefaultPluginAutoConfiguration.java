package com.example.plugindemo.original.defaultplugin;

import com.example.plugindemo.base.ExtensionPlugin;
import com.example.plugindemo.base.sample.SayHelloWorld;
import com.example.plugindemo.original.tenantplugin.TenantPluginConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:30
 * @Description:
 * @Version 1.0.0
 */
@AutoConfiguration(after = {TenantPluginConfig.class})
@ConditionalOnClass(ExtensionPlugin.class)
public class DefaultPluginAutoConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public SayHelloWorld sayHelloWorldDefaultPlugin() {
        return new SayHelloWorldDefaultPlugin();
    }
}
