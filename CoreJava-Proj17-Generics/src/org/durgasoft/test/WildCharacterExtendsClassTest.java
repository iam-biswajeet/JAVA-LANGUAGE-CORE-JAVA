package org.durgasoft.test;

import java.util.ArrayList;

public class WildCharacterExtendsClassTest {
	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		m1(al1);
		ArrayList<String> al2=new ArrayList<String>();
		//m1(al2);
	}
	public static void m1(ArrayList<? extends Number> l) {
		l.add(null);
	}
}
