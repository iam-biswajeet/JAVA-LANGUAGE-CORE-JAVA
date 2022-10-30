package org.durgasoft.test;

import java.util.ArrayList;

public class GenericCodeTest {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<String>();
		al.add("Rama");
		al.add(10);
		al.add(10.5);
		System.out.println(al);
	}
}
