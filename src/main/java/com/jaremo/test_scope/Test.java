package com.jaremo.test_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/com/jaremo/test_scope/spring.xml");
		
		A a = (A)ac.getBean("a");
		A a1 = (A)ac.getBean("a");
		System.out.println(a == a1);
	}
}
