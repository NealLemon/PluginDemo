package com.example.plugindemo.original.tenantplugin;

import com.example.plugindemo.base.sample.SayHelloWorld;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:24
 * @Description:
 * @Version 1.0.0
 */
public class SayHelloWorldTenantPlugin implements SayHelloWorld {
    @Override
    public String sayHelloWorld() {
        return "Tenant Plugin say : Hello World";
    }
}
