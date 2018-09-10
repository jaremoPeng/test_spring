package com.jaremo.lesson2.test_mvc.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaremo.lesson2.test_mvc.dao.BookDao;
import com.jaremo.lesson2.test_mvc.service.BookService;
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookdao;

	public List<Map<String, Object>> findBytitle(String titlekeycode) {
		if(titlekeycode == null)
			titlekeycode = "";
		return bookdao.findBytitle(titlekeycode);
	}

}
