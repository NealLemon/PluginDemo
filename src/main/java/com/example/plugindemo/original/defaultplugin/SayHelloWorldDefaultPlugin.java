package com.example.plugindemo.original.defaultplugin;

import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:21
 * @Description:
 * @Version 1.0.0
 */

@ConditionalOnMissingBean(type = {"SayWorld"})
@Service
public class SayHelloWorldDefaultPlugin implements SayWorld {

    @Override
    public String sayWorld() {
        return "Default Plugin Say : Hello World";
    }
}
