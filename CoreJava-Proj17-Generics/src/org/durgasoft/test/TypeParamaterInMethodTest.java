package org.durgasoft.test;

public class TypeParamaterInMethodTest {
	public <T>void m1(T t) {}
	public <T extends Number>void m2(T t) {}
	public <T extends Number & Runnable>void m3(T t) {}
	public <T extends Runnable & Cloneable>void m4(T t) {}
	//public <T extends Runnable & Number>void m5(T t) {}

}
