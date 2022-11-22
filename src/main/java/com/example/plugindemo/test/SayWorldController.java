package com.example.plugindemo.test;

import com.example.plugindemo.base.sample.SayWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Neal
 * @Date: 2022/11/15 15:26
 * @Description:
 * @Version 1.0.0
 */
@RequestMapping("/say/")
@RestController
public class SayWorldController {

    private final SayWorld sayWorld;

    public SayWorldController(SayWorld sayWorld) {
        this.sayWorld = sayWorld;
    }



    @GetMapping("world")
    public String sayWorld() {
        return sayWorld.sayWorld();
    }
}
