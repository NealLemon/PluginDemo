package com.example.plugindemo.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @description: 自定义条件装配注解
 * @author: Neal
 * @date: 2022/11/21
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnPluginCondition.class)
public @interface PluginCondition {

    String tenant() default "default";

}
