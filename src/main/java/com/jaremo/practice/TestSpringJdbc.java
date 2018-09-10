package com.jaremo.practice;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestSpringJdbc {
	
	private static Logger log = Logger.getLogger(TestSpringJdbc.class);
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/com/jaremo/practice/spring.xml");
		
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		List<Map<String, Object>> list = jt.queryForList("select * from book");
		log.debug(list.size());
	}
}
