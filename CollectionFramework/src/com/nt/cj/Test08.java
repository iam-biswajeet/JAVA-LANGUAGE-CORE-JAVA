package com.nt.cj;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Test08 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("Z");
		set.add(10);
		set.add(null);
		System.out.println(set.add("A"));
		System.out.println(set);
	}
}
