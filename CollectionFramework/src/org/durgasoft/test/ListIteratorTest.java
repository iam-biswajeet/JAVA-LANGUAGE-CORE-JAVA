package org.durgasoft.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) {
		List list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list);
		ListIterator ltr=list.listIterator();
		while(ltr.hasNext()) {
			Integer i=(Integer)ltr.next();
			if(i==2) {
				ltr.remove();
			}
			if(i==4) {
				ltr.set(40);
			}
			if(i==6) {
				ltr.add(60);
			}
		}
	System.out.println(list);
	while(ltr.hasPrevious()) {
		System.out.print(ltr.previous()+" ");
	}
	}
	

}
