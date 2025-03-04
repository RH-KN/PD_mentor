package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.controller.PersonalDevController;

@SpringBootApplication
@ComponentScan(basePackageClasses = PersonalDevController.class)

public class PersonalDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalDevelopmentApplication.class, args);
	}

}
