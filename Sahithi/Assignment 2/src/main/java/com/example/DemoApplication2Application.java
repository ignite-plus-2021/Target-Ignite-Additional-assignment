package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude= {ErrorMvcAutoConfiguration.class})
public class DemoApplication2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication2Application.class, args);
	}

}
