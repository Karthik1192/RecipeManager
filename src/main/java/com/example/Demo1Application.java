package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.controller", "com.example.service"})
public class Demo1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(Demo1Application.class);
	}
	
	@RequestMapping("/")
	String home(){
		return "Welcome to Recipe Manager";
	}
}
