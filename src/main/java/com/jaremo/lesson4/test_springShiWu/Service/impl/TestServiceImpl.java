package com.jaremo.lesson4.test_springShiWu.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jaremo.lesson4.test_springShiWu.Service.TestService;

@Component
public class TestServiceImpl implements TestService {

	@Autowired
	private JdbcTemplate jt;
	@Autowired
	private TestServiceDouble tsd;
	
	public void addBalance(int value) {
		String sql = "update account set abalance = abalance + "+value+" where aid = 1";
		System.out.println(sql);
		jt.execute(sql);
		
		tsd.radisBalance(value , jt);
	}
}
