package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.capg.dao")
@ComponentScan("com.capg.service")
@ComponentScan("com.capg.beans")
@ComponentScan("com.capg.controller")
@EntityScan(basePackages = {"com.capg.beans"})
@SpringBootApplication
public class TdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdsApplication.class, args);
	}

}
