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
        //获取当前类中注解PluginCondition的所有属性
        Map<String,Object> attributes = metadata.getAnnotationAttributes(PluginCondition.class.getName());
        //获取 租户代码
        String tenant = String.valueOf(attributes.get(TENANT_KEY));
        //获取当前应用的环境变量 包括外部化配置
        Environment environment = context.getEnvironment();
        //获取外部化配置值
        String environmentTenant = environment.getProperty(TENANT_KEY);
        //如果为空 则默认赋值 default 启动默认插件
        if(!StringUtils.hasLength(environmentTenant)) {
            environmentTenant = "default";
        }
        //返回条件判断结果
        return tenant.equals(environmentTenant);
    }
}
