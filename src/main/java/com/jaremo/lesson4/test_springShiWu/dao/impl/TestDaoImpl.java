package com.jaremo.lesson4.test_springShiWu.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jaremo.lesson4.test_springShiWu.dao.TestDao;

public class TestDaoImpl implements TestDao{

	private JdbcTemplate jt;
	public void updateBalance(int value, String aname) {
		String sql = "update account set abalance = abalance - "+value+" where aname = '"+aname+"'";
		System.out.println(sql);
		jt.execute(sql);
	}

}
