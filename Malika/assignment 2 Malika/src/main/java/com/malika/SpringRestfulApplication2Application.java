package com.malika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude= {ErrorMvcAutoConfiguration.class})
public class SpringRestfulApplication2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestfulApplication2Application.class, args);
	}

}
