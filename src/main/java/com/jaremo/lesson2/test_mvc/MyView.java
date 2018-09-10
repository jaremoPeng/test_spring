package com.jaremo.lesson2.test_mvc;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaremo.lesson2.test_mvc.controller.BookController;

public class MyView {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("classpath:com/jaremo/lesson2/test_mvc/spring.xml");
		BookController bc = (BookController)cac.getBean("bookController");
		
		System.out.println("请输入书名");
		String nextLine = sc.nextLine();
		List<Map<String, Object>> findBook = bc.findBook(nextLine);
		System.out.println(findBook);
	}
}
