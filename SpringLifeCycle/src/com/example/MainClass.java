package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		// Spring5에서는 xml이 빠짐
		// Container 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		// Container 설정
		ctx.load("classpath:beans.xml");
		// load후 반드시 refresh해야 container파일이 xml파일과 바인딩
		ctx.refresh();

		// Container를 통한 Bean관리
		// Student jimin = ctx.getBean("student1", Student.class);
		// System.out.println(jimin);
		// Employee jimin = ctx.getBean("emp1", Employee.class);
		// System.out.println(jimin);
		// Student jimin = ctx.getBean("student2", Student.class);
		// System.out.println(jimin);
		Student jimin = ctx.getBean("student5", Student.class);
		System.out.println(jimin);
		
		
		// Container 소멸
		ctx.close();

		/*
		 * //Annotation으로 하면 중간에 load, refresh가 빠짐 //Container 생성
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext(ApplicationConfig.class);
		 * 
		 * //Container를 통한 Bean관리하기 Student jimin = ctx.getBean("student2",
		 * Student.class); System.out.println(jimin);
		 * 
		 * //Container 소멸 ctx.close();
		 */

	}
}
