package com.jaremo.lesson2.test_beanlife;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("classpath:/com/jaremo/lesson2/test_beanlife/spring.xml");
		Object bean = cac.getBean("a"); // 当调用getbean()时 调用初始化方法
		
		/*
		 八月 31, 2018 2:13:47 下午 org.springframework.context.support.AbstractApplicationContext doClose
		信息: Closing org.springframework.context.support.ClassPathXmlApplicationContext@1f558aa: startup date [Fri Aug 31 14:13:47 CST 2018]; root of context hierarchy
		我在bean销毁时被调用
		 */
		cac.close(); // 当configurableApplicationContext类 调用close()方法时则调用 destory()方法
	}
}
