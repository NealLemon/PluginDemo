package com.example.plugindemo.base;

import com.example.plugindemo.base.sample.SayHelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:26
 * @Description:
 * @Version 1.0.0
 */
@RequestMapping("/test/")
@RestController
public class SayHelloController {

    private final SayHelloWorld sayHelloWorld;

    public SayHelloController(SayHelloWorld sayHelloWorld) {
        this.sayHelloWorld = sayHelloWorld;
    }



    @GetMapping("hello")
    public String sayHello() {
        return sayHelloWorld.sayHelloWorld();
    }
}
