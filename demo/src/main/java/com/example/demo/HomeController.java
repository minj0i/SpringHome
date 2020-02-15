package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/demo")
	public String hello(String name) {
		return "Hello, Spring Boot World" + name;
	}
}