package com.praticas.springboot.aprendendospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("model")
@ComponentScan("controller")
public class AprendendoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendendoSpringbootApplication.class, args);
	}

}
