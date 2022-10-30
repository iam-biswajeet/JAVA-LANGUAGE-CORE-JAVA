package org.durgasoft.test;

import java.util.ArrayList;

public class GenericMethodTest {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		m1(al);
	}
	public static  void m1(ArrayList<String> al) {
		al.add("raja");
		al.add(null);
	//	al.add(1);
		System.out.println(al);
	}

}
