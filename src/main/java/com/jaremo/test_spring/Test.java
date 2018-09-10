package com.jaremo.test_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 假如配置文件位于类路径下 classpath:com/jaremo/test_spring/spring.xml
		// 假如配置文件位于本地磁盘下 file:e:/spring.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		// getBean(配置文件中的id)
		A a = (A)ac.getBean("a");
		
		// getBean(类.class) 但存在两个同类型的时候不适用
//		A a1= ac.getBean(A.class);
		
		// getBeam(类路径) 在配置文件不能存在<bean>中不能存在id属性 , 存在两个同类型的bean也适用,会取第一个
//		B a2 = (B)ac.getBean("com.jaremo.test_spring.B");
		a.setName("zs");
		System.out.println(a);
		
		B b = (B)ac.getBean("b");
//		System.out.println(b.getA().getName());
		
		/*
		 a
		 c
		 b
		 com.jaremo.test_spring.B#0
		 com.jaremo.test_spring.B#1
		 */
		// 可以看到 配置文件中存在多个同类型的bean 但没有id属性  他们的命名是 [类路径#index]
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String beanname : beanDefinitionNames) {
			System.out.println(beanname);
		}
	}
}
