package com.jaremo.lesson2.test_annotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
	@Autowired //可以同时装配多个bean
	private A[] aArray;
	@Autowired
	private List<A> aList;
	@Autowired
	private Map<String, A> aMap; // 以bean的id名作键  , bean对象作value
	
	public A[] getaArray() {
		return aArray;
	}
	public void setaArray(A[] aArray) {
		this.aArray = aArray;
	}
	public List<A> getaList() {
		return aList;
	}
	public void setaList(List<A> aList) {
		this.aList = aList;
	}
	public Map<String, A> getaMap() {
		return aMap;
	}
	public void setaMap(Map<String, A> aMap) {
		this.aMap = aMap;
	}
}
