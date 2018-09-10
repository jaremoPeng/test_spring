package com.jaremo.lesson3.test_dynamicproxy;

/*
 * 建立一个测试方法执行时间的类
 */
public class MonitorUtil {

	private static ThreadLocal<Long> tl = new ThreadLocal<Long>();
	
	public static void start() {
		tl.set(System.currentTimeMillis());
	}
	
	// 结束时打印耗时
	public static void finish(String methodName) {
		long finishTime = System.currentTimeMillis();
		System.out.println(methodName+"方法耗时"+(finishTime - tl.get())+"ms");
	}
}
