package com.example.plugindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.plugindemo.base","com.example.plugindemo.test","com.example.plugindemo.auto"})
public class PluginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluginDemoApplication.class, args);
	}

}
