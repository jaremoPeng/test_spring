package com.jaremo.lesson3.test_springaop.dao.impl;

import org.springframework.stereotype.Repository;

import com.jaremo.lesson3.test_springaop.dao.MethodDao;

public class MethodDaoImpl implements MethodDao {

	public void sayHi() {
		System.out.println("你好页");
	}

}
