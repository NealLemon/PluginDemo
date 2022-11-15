package com.example.plugindemo.original.defaultplugin;

import com.example.plugindemo.base.sample.SayHelloWorld;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:21
 * @Description:
 * @Version 1.0.0
 */
public class SayHelloWorldDefaultPlugin implements SayHelloWorld {

    @Override
    public String sayHelloWorld() {
        return "Default Plugin Say : Hello World";
    }
}
