package com.jaremo.practice;

public class CreateConnectionObject {

	//使用spring+jdbc创建一个连接的bean（oracle或者mysql）
    //通过getBean直接获取的是Connection对象
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
//		ResolveSpringXML rsx = new ResolveSpringXML("src/main/java/com/jaremo/practice/spring.xml");
//		CreateConnectionObject bean = (CreateConnectionObject) rsx.getBean("bean");
//		System.out.println(bean);
	}
}
