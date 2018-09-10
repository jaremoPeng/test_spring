package com.jaremo.lesson3.test_springaop.log;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaremo.lesson3.test_springaop.service.MethodService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/jaremo/lesson3/test_springaop/log/spring.xml");
		
		Mathod mathod = (Mathod)ctx.getBean("mathod");
		mathod.say();
	}
}
