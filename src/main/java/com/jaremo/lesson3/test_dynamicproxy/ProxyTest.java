package com.jaremo.lesson3.test_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		// 创建一个实例对象,这个对象是被代理的对象
		Person zs = new Student("zs");
		
		// 创建一个与代理对象相关联的InvocationHandler
		InvocationHandler stuHandler = new StuInvocationHandler<Person>(zs);
		
		// 创建一个代理对象来替换zs
		Person stu = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[] {Person.class}, stuHandler);
		
		// 代理执行zs的giveMoney()方法
		stu.giveMoney();
	}
}
