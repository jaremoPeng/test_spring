package com.jaremo.lesson2.test_mvc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jaremo.lesson2.test_mvc.dao.BookDao;
@Repository
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private JdbcTemplate jt;

	public List<Map<String, Object>> findAll() {
		String sql="select * from book";
		return jt.queryForList(sql);
	}

	public List<Map<String, Object>> findBytitle(String titlekeycode) {
		String sql="select * from book where bname like '%"+titlekeycode+"%'";
		return jt.queryForList(sql);
	}

}
