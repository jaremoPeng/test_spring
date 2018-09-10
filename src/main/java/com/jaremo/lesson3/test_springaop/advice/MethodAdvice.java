package com.jaremo.lesson3.test_springaop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 定义一个切面
 */
public class MethodAdvice {
	
	// 前置通知 一定会执行
	public void doBefore(JoinPoint jt) {
		System.out.println("主要的方法前,执行了: "+jt.getSignature().getName());
	}
	
	// 后置通知 一定会执行
	public void doAfter() {
		System.out.println("方法已经执行完了");
	}
	
	// 环绕通知
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("这是环绕通知前");
		Object result = pjp.proceed(); // 代理执行被代理类的指定方法 , 它返回方法的返回值
		System.out.println("这是环绕通知后");
		return result;
	}
	
	// 返回通知  在   被代理类的指定方法  被调用之后马上执行
	public void doAfterReturning(JoinPoint jp) {
		System.out.println("返回通知  类路径: "+jp.getClass().getName()+" 方法名: "+jp.getSignature().getName()+" 参数: "+jp.getArgs()[0]);
	}
	
	// 异常通知 被代理类的指定方法调用之后 出现异常 , 返回通知不会执行
	public void doAfterThrowing(JoinPoint jp , Throwable ex) {
		System.out.println("这是异常通知");
		System.out.println("异常信息为: "+ex.getMessage());
	}
}
