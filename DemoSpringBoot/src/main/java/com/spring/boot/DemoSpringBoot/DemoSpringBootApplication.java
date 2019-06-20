package com.spring.boot.DemoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		 System.setProperty("server.servlet.context-path", "/demospringboot");
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

}
