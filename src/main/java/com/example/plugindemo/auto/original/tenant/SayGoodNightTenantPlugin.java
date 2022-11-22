package com.example.plugindemo.auto.original.tenant;

import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.stereotype.Service;

/**
 * @Auther: Neak
 * @Date: 2022/11/22 17:20
 * @Description: 租户插件实现
 * @Version 1.0.0
 */
@Service
public class SayGoodNightTenantPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Tenant Plugin say : Good Night";
    }
}
