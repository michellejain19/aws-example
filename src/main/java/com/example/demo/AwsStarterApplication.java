package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsStarterApplication.class, args);
	}
	
	@GetMapping("/getName")
	public String getName() {
		return "Ankit !!! This is a change";
	}

}
