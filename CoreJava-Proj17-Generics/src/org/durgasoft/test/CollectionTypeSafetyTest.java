package org.durgasoft.test;

import java.util.ArrayList;

public class CollectionTypeSafetyTest {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Rama");
		al.add("Raja");
		al.add(10);//---->Not type Safety
		String name1=(String)al.get(0);
		String name2=(String)al.get(1);
		//String name3=(String)al.get(2);//--------->R.E::ClassCastException
	}
}
