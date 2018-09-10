package com.jaremo.lesson2.test_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class A {
	
//	@Value("jaremo") // 给属性设置值
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
