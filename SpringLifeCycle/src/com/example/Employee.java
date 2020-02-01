package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

public class Employee /* implements InitializingBean, DisposableBean */ {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	/*
	 * //DisposableBean 안에 들어있는 destroy
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("방금 Bean이 소멸되었습니다."); }
	 * 
	 * //InitializingBean 안에 있는 afterPropertiesSet
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("방금 Bean이 생성되었습니다."); }
	 */
	
	@PostConstruct
	public void initMethod() {
		System.out.println("방금 Bean이 생성됨.");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("방금 Bean이 소멸되었습니다.");
	}

}
