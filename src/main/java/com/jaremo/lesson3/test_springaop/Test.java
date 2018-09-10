package com.jaremo.lesson3.test_springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaremo.lesson3.test_springaop.service.MethodService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/jaremo/lesson3/test_springaop/spring.xml");
		
		MethodService bean = (MethodService) ctx.getBean("methodService");
		bean.run("天空有");
	}
}
