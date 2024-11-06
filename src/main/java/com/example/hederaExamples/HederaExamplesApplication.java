package com.example.hederaExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.hederaExamples.examples")
public class HederaExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HederaExamplesApplication.class, args);
	}

}
