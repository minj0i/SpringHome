package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Employee;

public class BeanTest {
	ApplicationContext ctx;
	
	@Before
	public void init() {
		this.ctx = new GenericXmlApplicationContext("classpath:beans.xml");
	}
	
	@Test
	public void test1() {
		Employee jimin = this.ctx.getBean("emp1", Employee.class);
		
		Employee younghee = (Employee)this.ctx.getBean("emp1");
		
		//현재 beans.xml에서 bean 에 직접 init-method="initMethod" destroy-method="destroyMethod"를 넣어서
		//방금Bean이 생성됨 메세지가 두번 호출됨
		// 그 외 방법을 사용하면 ctx.load("classpath:beans.xml");, refresh를 한번 거치므로 한번만 메세지가 뜸
		
		//if(jimin == younghee) System.out.println("Equals");
		//else System.out.println("Different");
	}
}
