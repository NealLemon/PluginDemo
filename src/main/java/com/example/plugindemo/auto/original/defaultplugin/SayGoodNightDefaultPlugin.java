package com.example.plugindemo.auto.original.defaultplugin;

import com.example.plugindemo.base.sample.SayWorld;

/**
 * @Auther: Neal
 * @Date: 2022/11/22 17:18
 * @Description: 自动装配默认实现插件
 * @Version 1.0.0
 */
public class SayGoodNightDefaultPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Default Plugin by auto configuration say : Good Night";
    }
}
