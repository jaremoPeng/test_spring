package com.jaremo.lesson2.test_mvc.dao;

import java.util.List;
import java.util.Map;

public interface BookDao {

	/**
	 * 查询所有的图书
	 * @return list集合
	 */
	public List<Map<String, Object>> findAll();
	
	/**
	 * 根据书名关键字  查询图书
	 * @param titlekeycode 书名关键字 
	 * @return list集合
	 */
	public List<Map<String, Object>> findBytitle(String titlekeycode);
}
