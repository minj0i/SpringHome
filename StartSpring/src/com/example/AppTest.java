package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppTest {
	GenericXmlApplicationContext context;
	
	//Before : 항상 test보다 먼저하는 것
	//항상 먼저 ApplicationContext를 생성해야 하기 때문에
	//1. IoC Container 생성
	@Before
	public void init() {
		context = new GenericXmlApplicationContext("config/applicationContext.xml");
	}
	
	@Test
	public void test1(){
		MyCalculator myCalculator = context.getBean("myCalculator", MyCalculator.class);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
	}
	
	@After
	public void close() {
		context.close();
	}
}
