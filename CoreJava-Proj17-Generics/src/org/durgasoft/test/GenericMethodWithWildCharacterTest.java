package org.durgasoft.test;

import java.util.ArrayList;

public class GenericMethodWithWildCharacterTest {
	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		m1(al1);
		ArrayList<String> al2=new ArrayList<String>();
		m1(al2);
		
		
	}
	public static void m1(ArrayList<?> l) {
		l.add(null);
		/*
		 * l.add("Rama"); l.add(0)
		 */;
		 System.out.println(l);
	}
}

