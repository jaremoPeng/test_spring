package com.jaremo.test_autowire;

public class B {
	/*
	 * 默认 是ref属性
	 * no 是不装配
	 * constructor 构造器装配
	 * byType 根据类型来装配
	 * byName 根据setter的名字来装配
	 * 以上列出的值 , 只能对一个bean进行装配
	 * 假如你使用的是autowire = "byName" 来自动装配的话
	 * 这里面的依赖bean的名称 例如这个A对象的名称a 必须要和spring.xml中被装配的bean节点的id名相同
	 * 否则装配失败
	 */
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
