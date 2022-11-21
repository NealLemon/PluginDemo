package com.example.plugindemo.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @description: 条件装配判断
 * @author: Neal
 * @date: 2022/11/21
 **/
public class OnPluginCondition implements Condition {
    private static String TENANT_KEY = "tenant";
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String,Object> attributes = metadata.getAnnotationAttributes(PluginCondition.class.getName());
        String tenant = String.valueOf(attributes.get(TENANT_KEY));
        Environment environment = context.getEnvironment();
        String environmentTenant = environment.getProperty(TENANT_KEY);
        if(!StringUtils.hasLength(environmentTenant)) {
            environmentTenant = "default";
        }
        return tenant.equals(environmentTenant);
    }
}
