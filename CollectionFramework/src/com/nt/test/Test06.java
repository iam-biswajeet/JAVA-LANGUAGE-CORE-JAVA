package com.nt.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test06 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Integer i =(Integer)itr.next();
			if(i%2==0) {
				System.out.print(i+"  ");
			}
			else {
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(list);
		
		
	}
}
