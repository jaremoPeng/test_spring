package com.jaremo.test_iocdi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/com/jaremo/test_iocdi/spring.xml");
		
		A a = (A)ac.getBean("a");
		
		System.out.println(a.getName());
		
		B b = (B)ac.getBean("b");
		System.out.println(b.getA().getName());
		
		C c = (C) ac.getBean("c");
		System.out.println(c.getB().getA().getName());
		
		Fuza fz = (Fuza) ac.getBean("fz");
		String[] names = fz.getNames();
		for (String result : names) {
			System.out.print(result+" ");
		}
		List<String> nameList = fz.getNameList();
		for (String result : nameList) {
			System.out.print(result+" ");
		}
		Map<String, String> nameMap = fz.getNameMap();
		Set<String> keys = nameMap.keySet();
		for (String key : keys) {
			System.out.print(key+"->"+nameMap.get(key)+" ");
		}
		Properties pro = fz.getPro();
		Set<Object> prokeys = pro.keySet();
		for (Object key : prokeys) {
			System.out.print(key+"->"+pro.getProperty((String) key)+" ");
		}
	}
}
