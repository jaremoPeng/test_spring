package com.jaremo.test_iocdi;

public class C {

	private B b;
	public C(B b) {
		this.b = b;
	}
	public B getB(){
		return this.b;
	}
}
