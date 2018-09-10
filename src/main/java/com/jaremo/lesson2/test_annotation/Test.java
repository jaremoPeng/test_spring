package com.jaremo.lesson2.test_annotation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static Logger log = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("classpath:/com/jaremo/lesson2/test_annotation/spring.xml");
//		B bean = (B) cac.getBean("b");
//		A a = (A)cac.getBean("ang");
//		log.debug(a);
		
		C c = (C)cac.getBean("c");
		A[] array = c.getaArray();
		for (A a : array) {
			log.debug("array -> "+a.getName());
		}
		List<A> list = c.getaList();
		for (A a : list) {
			log.debug("list -> "+a.getName());
		}
		Map<String, A> map = c.getaMap();
		Set<String> set = map.keySet();
		for (String key : set) {
			log.debug("map的key  "+key);
			A a = map.get(key);
			log.debug("map -> "+a.getName());
		}
		
		cac.close();
	}
}
