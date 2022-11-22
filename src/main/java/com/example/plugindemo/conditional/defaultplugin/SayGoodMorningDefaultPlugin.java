package com.example.plugindemo.conditional.defaultplugin;

import com.example.plugindemo.base.sample.SayWorld;
import com.example.plugindemo.conditional.PluginCondition;
import org.springframework.stereotype.Service;

/**
 * @description: 条件装配 默认插件
 * @author: Neal
 * @date: 2022/11/21
 **/
@PluginCondition()
@Service
public class SayGoodMorningDefaultPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Default Plugin: Good Morning";
    }
}
