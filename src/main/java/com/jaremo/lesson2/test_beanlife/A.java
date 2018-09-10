package com.jaremo.lesson2.test_beanlife;

public class A {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("我在bean初始化调用");
	}
	
	public void destory() {
		// 依赖ConfigurableApplicationContext 类的close()方法来销毁对象
		System.out.println("我在bean销毁时被调用");
	}
}
