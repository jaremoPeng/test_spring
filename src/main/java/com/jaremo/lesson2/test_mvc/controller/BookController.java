package com.jaremo.lesson2.test_mvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jaremo.lesson2.test_mvc.service.BookService;

@Controller
public class BookController {

	@Autowired // 默认是根据类型来装配的
	private BookService bookservice;
	
	public List<Map<String, Object>> findBook(String titlekeycode){
		return bookservice.findBytitle(titlekeycode);
	}
}
