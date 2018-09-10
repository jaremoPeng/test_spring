package com.jaremo.test_dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/com/jaremo/test_dependson/spring.xml");
		
		A a = (A)ac.getBean("a");
		System.out.println(a.getName());
		
		B b = (B)ac.getBean("b");
		System.out.println(b.getA().getName());
	}
}
