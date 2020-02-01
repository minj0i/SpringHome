package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	//Bean은 반드시 return 객체로 쓸 타입이어야 하며, 메소드 이름이 Bean의 id가 됨
	
	/*
	 * @Bean
	 
	public Student student2() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("바둑");
		hobbies.add("등산");
		hobbies.add("낚시");
		Student student = new Student("김지민", 35, hobbies);
		student.setHeight(175.3);
		student.setWeight(48.2);
		return student;
	}
	
	*/
}
