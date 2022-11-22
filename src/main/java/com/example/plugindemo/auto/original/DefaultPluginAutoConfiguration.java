package com.example.plugindemo.auto.original;

import com.example.plugindemo.auto.original.defaultplugin.SayGoodNightDefaultPlugin;
import com.example.plugindemo.base.ExtensionPlugin;
import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:30
 * @Description: 自动装配默认插件实现
 * @Version 1.0.0
 */
@ConditionalOnClass(ExtensionPlugin.class)
public class DefaultPluginAutoConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public SayWorld sayWorldDefaultPlugin() {
        return new SayGoodNightDefaultPlugin();
    }
}
