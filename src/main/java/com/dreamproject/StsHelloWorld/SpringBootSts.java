package com.dreamproject.StsHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSts {
	
	public static void main(String[] args) {

		System.out.println("Main Method");
		SpringApplication.run(SpringBootSts.class, args);
		
		System.out.println("Hello Kedar");
	}

}
