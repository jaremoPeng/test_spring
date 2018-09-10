package com.jaremo.lesson3.test_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * 创建一个类型实现invocationHandler,里面有个invoke方法 , 所有执行代理对象的方法都会被替换成执行invoke方法
 * 定义泛型  , 建立一个方法target成员变量
 */
public class StuInvocationHandler<T> implements InvocationHandler {
	T target; // 指被代理的类
	
	public StuInvocationHandler(T target) {
		this.target = target;
	}
	
	public Object invoke(Object obj, Method method, Object[] params) throws Throwable {
		System.out.println("代理执行"+method.getName()+"方法");
		
		MonitorUtil.start(); // 插入监测的类,计算方法耗时
		Object result = method.invoke(obj, params);
		MonitorUtil.finish(method.getName());
		return result;
	}
}
