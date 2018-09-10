package com.jaremo.practice;


import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.dom4j.Attribute;
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;


public class ResolveSpringXML {
	private Map<String, Object> beanMap= new HashMap<String, Object>();
	
//	public ResolveSpringXML(String xmlpath) {
//		Element ele = init(xmlpath);
//		dom_parser(ele);
//	}
//	
//	public Element init(String xmlpath) {
//		SAXReader sr = new SAXReader();
//		try {
//			Document dom = sr.read(new File(xmlpath));
//			return dom.getRootElement();
//		} catch (DocumentException e) {
//			throw new RuntimeException("xml文件未找到");
//		}
//	}
//	
//	public void dom_parser(Element ele) {
//		String id = "";
//		Object obj = null;
//		if(ele.getName().equals("bean")) {
//			List<Attribute> attributes = ele.attributes();
//			for (Attribute attr : attributes) {
//				String name = attr.getName();
//				String value = attr.getValue();
//				if(name.equals("id")) {
//					id = value;
//				}
//				if(name.equals("class")) {
//					try {
//						Class clazz = Class.forName(value);
//						 obj = clazz.newInstance();
//					} catch (ClassNotFoundException e) {
//						e.printStackTrace();
//					} catch (InstantiationException e) {
//						e.printStackTrace();
//					} catch (IllegalAccessException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			beanMap.put(id, obj);
//		}
//		
//		List<Element> eleList = ele.elements();
//		for(Element e : eleList){
//			dom_parser(e);
//		}
//	}
//	
//	public Object getBean(String id) {
//		return beanMap.get(id);
//	}
}
