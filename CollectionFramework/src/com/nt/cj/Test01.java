package com.nt.cj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("a");
		l.add(10);
		l.add("a");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"m");
		l.add("n");
		System.out.println(l);
		//Synchronized Version of List
		List list=Collections.synchronizedList(l);
		System.out.println(list);
		
	}

}
