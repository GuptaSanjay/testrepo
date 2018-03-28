package com.springboot.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainEntry.class, args);
	}

}
