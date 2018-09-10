package com.jaremo.lesson4.test_springShiWu.Service.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestServiceDouble {

	public void radisBalance(int value , JdbcTemplate jt) {
		String sql = "update account set abalance = abalance - "+value+" where aid = 2";
		jt.execute(sql);
	}
}
