package org.durgasoft.test;

import java.util.ArrayList;

public class GenericMethodSuperClassTest {
	public static void main(String[] args) {
		ArrayList<Number> al1=new ArrayList<Number>();
		m1(al1);
		ArrayList<Object> al2=new ArrayList<Object>();
		m1(al2);
	}
	public static void m1(ArrayList<? super Number> l) {
		l.add(10);
		l.add(10.5);
		l.add(null);
		//l.add("Raja");
		System.out.println(l);
	}
}
