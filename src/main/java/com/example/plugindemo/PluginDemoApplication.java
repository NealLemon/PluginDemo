package com.example.plugindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.plugindemo.base","com.example.plugindemo.test","com.example.plugindemo.original"})
public class PluginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluginDemoApplication.class, args);
	}

}
