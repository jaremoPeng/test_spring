package com.jaremo.lesson4.test_springShiWu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaremo.lesson3.test_springaop.service.MethodService;
import com.jaremo.lesson4.test_springShiWu.Service.TestService;
import com.jaremo.lesson4.test_springShiWu.dao.TestDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/jaremo/lesson4/test_springShiWu/spring.xml");
		TestService td = (TestService)ac.getBean("testServiceImpl");
		td.addBalance(10);
	}
}
