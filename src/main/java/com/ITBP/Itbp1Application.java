package com.ITBP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.ITBP","com.services","com.model","com.controller","com.repository","com.helper"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.repository")
public class Itbp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Itbp1Application.class, args);
	}

}
