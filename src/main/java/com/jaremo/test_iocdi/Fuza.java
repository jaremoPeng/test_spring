package com.jaremo.test_iocdi;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Fuza {

	private String[] names;
	private List<String> nameList;
	private Map<String, String> nameMap;
	private Properties pro;
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	public Map<String, String> getNameMap() {
		return nameMap;
	}
	public void setNameMap(Map<String, String> nameMap) {
		this.nameMap = nameMap;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
}
