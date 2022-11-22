package com.example.plugindemo.condition.original.defaultplugin;

import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:21
 * @Description: say Hello world 插件默认实现
 * @Version 1.0.0
 */

@ConditionalOnMissingBean(type = {"SayWorld"})
@Service
public class SayHelloWorldDefaultPlugin implements SayWorld {

    @Override
    public String sayWorld() {
        return "Default original condition Plugin Say : Hello World";
    }
}
