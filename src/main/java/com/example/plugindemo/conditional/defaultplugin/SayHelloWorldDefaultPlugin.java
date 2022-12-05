package com.example.plugindemo.conditional.defaultplugin;

import com.example.plugindemo.base.SayWorld;
import com.example.plugindemo.conditional.PluginCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

/**
 * @description: 条件装配 默认插件
 * @author: Neal
 * @date: 2022/11/21
 **/
//判断是否有该 插件类别的Bean 已经注册在容器中,如果没有 则注册 即注册默认的插件
@ConditionalOnMissingBean(type = {"SayWorld"})
//自定义条件装配注解
@PluginCondition()
@Service
public class SayHelloWorldDefaultPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Default Plugin: Say Hello World";
    }
}
