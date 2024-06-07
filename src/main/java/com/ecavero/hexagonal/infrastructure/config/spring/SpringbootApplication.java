package com.ecavero.hexagonal.infrastructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.ecavero.hexagonal.infrastructure")
@EntityScan(basePackages = "com.ecavero.hexagonal.domain")
@ComponentScan(basePackages = "com.ecavero.hexagonal")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
