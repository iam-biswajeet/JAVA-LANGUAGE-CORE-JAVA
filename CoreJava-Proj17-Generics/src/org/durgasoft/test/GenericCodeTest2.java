package org.durgasoft.test;

import java.util.ArrayList;
import java.util.List;

public class GenericCodeTest2 {
	public static void main(String[] args) {
		List<String> li1=new ArrayList();
		li1.add("Rama");
		//li1.add(10);
		System.out.println(li1);
		List<String> li2=new ArrayList<String>();
		li2.add("Raja");
		//li2.add(10);
		System.out.println(li2);
	}
}
