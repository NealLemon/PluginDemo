package com.example.plugindemo.condition.original.tenant;

import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.stereotype.Service;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:24
 * @Description:     Say hello world 租户插件实现
 *                  只有一个租户的时候,适合每个租户对应一份项目代码
 * @Version 1.0.0
 */
@Service
public class SayHelloWorldTenantPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Single Tenant original condition Plugin say : Hello World";
    }
}
