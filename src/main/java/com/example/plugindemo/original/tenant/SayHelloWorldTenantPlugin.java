package com.example.plugindemo.original.tenant;

import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.stereotype.Service;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:24
 * @Description:
 * @Version 1.0.0
 */
@Service
public class SayHelloWorldTenantPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Tenant Plugin say : Hello World";
    }
}
