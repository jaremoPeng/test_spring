package com.jaremo.lesson2.test_outpropfile;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	
	private static Logger log = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/com/jaremo/lesson2/test_outpropfile/spring.xml");
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		
		List<Map<String, Object>> list = jt.queryForList("select * from book");
		log.debug(list.size());
		
		ac.close();
	}
}
