package com.example.plugindemo.conditional.tenant;

import com.example.plugindemo.base.sample.SayWorld;
import com.example.plugindemo.conditional.PluginCondition;
import org.springframework.stereotype.Service;

/**
 * @description: 条件装配 租户插件
 * @author: Neal
 * @date: 2022/11/21
 **/
@PluginCondition(tenant = "china")
@Service
public class SayGoodMorningTenantPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Tenant: Good Morning";
    }
}
