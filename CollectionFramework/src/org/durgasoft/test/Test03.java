package org.durgasoft.test;

import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("a");
		System.out.println(v.capacity());
	}
	
}
