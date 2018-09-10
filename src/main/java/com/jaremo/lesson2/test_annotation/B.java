package com.jaremo.lesson2.test_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class B {
	
//	@Autowired
//	@Qualifier("ang") 指定autowired装配哪个对象
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
}
