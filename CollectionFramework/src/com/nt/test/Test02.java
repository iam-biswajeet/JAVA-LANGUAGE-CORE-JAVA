package com.nt.test;

import java.util.LinkedList;

public class Test02 {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("biswa");
		list.add(30);
		list.add(null);
		list.add("biswa");
		System.out.println(list);
		list.set(0, "raja");
		System.out.println(list);
		list.set(0,"rama");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("raja");
		System.out.println(list);
	}
	
}
