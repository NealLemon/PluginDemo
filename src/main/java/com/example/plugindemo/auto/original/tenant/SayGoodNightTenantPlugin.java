package com.example.plugindemo.auto.original.tenant;

import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.stereotype.Service;

/**
 * @Auther: za-zhushaobin
 * @Date: 2022/11/22 17:20
 * @Description:
 * @Version 1.0.0
 */
@Service
public class SayGoodNightTenantPlugin implements SayWorld {
    @Override
    public String sayWorld() {
        return "Tenant Plugin say : Good Night";
    }
}
