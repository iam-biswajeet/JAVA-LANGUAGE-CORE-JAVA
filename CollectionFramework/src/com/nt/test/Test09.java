package com.nt.test;

import java.util.LinkedHashSet;

public class Test09 {
	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
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
