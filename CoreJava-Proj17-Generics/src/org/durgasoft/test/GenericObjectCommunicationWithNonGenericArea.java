package org.durgasoft.test;

import java.util.ArrayList;

public class GenericObjectCommunicationWithNonGenericArea {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Raja");
		al.add("Bapuni");
		m1(al);
		//al.add(34);
		System.out.println(al);
	}
	public static void m1(ArrayList l) {
		l.add("Rama");
		l.add(10);
		l.add(10.5);
	}
}
