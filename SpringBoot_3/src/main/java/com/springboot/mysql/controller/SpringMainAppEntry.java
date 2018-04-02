package com.springboot.mysql.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootApplication
@DirtiesContext
/*@ComponentScan(basePackages= {"com.springboot.mysql.controller"})
@EnableJpaRepositories(basePackages={"com.springboot.mysql.repository"})
@EntityScan(basePackages= {"com.springboot.mysql.entity"})*/
public class SpringMainAppEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringMainAppEntry.class, args);
	}

}
