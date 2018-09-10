package com.jaremo.lesson2.test_mvc.service;

import java.util.List;
import java.util.Map;

public interface BookService {

	public List<Map<String, Object>> findBytitle(String titlekeycode);
}
