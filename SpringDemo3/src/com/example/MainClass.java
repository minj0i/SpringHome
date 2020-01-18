package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//Annotation으로 만들때 쓰는 것
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//@Bean의 메소드 이름이 student1, 2였으므로 이름 그대로 꼭 넣어줘야 함 
		Student student1 = context.getBean("student1", Student.class);
		System.out.println(student1);
		
		Student student3 = context.getBean("student1", Student.class);
		if(student3 == student1) System.out.println("Equals");
		else System.out.println("Different");
		//Equals로 나옴. Singleton
		
		//return 타입이 Object이기 때문에 형변환 필요
		//Student student3 = (Student)context.getBean("student3");
		
		Student student2 = context.getBean("student2", Student.class);
		System.out.println(student2);
		
		context.close();
	}
}
