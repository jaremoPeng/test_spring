package com.jaremo.lesson3.test_springaop.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AddLog {

	private Logger log = Logger.getLogger(AddLog.class);
	public void inpouring(JoinPoint jp) {
		log.debug("当前执行的方法: "+jp.getSignature().getName());
	}
}
