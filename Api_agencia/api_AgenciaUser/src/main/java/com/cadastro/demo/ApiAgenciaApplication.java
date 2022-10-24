 package com.cadastro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages = {"com.cadastro.model"})
@EnableJpaRepositories(basePackages = {"com.cadastro.repositories"})
@ComponentScan(basePackages = {"com.cadastro.controller","com.cadastro.demo","com.cadastro.exception","com.cadastro.entity","com.cadstro.enums", "com.cadstro.service","com.cadastro.serviceImpl","com.cadastro.security"})
@SpringBootApplication
public class ApiAgenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAgenciaApplication.class, args);
	}

}
