package com.example.plugindemo.conditional.tenant;

import com.example.plugindemo.base.SayWorld;
import com.example.plugindemo.conditional.PluginCondition;
import org.springframework.stereotype.Service;

/**
 * @description: 条件装配 租户插件
 * @author: Neal
 * @date: 2022/11/21
 **/
//自定义条件装配注解 租户code 为 China
@PluginCondition(tenant = "China")
@Service
public class SayHelloWorldChinaPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "China Plugin: Say Hello World";
    }
}
