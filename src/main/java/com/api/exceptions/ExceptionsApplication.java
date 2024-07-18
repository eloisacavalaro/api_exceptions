package com.api.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionsApplication.class, args);

		Lista3 lista3 = new Lista3();
		lista3.ex1();
		lista3.menu();
	}

}
