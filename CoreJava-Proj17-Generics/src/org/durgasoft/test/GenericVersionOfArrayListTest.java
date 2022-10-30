package org.durgasoft.test;

import java.util.ArrayList;

public class GenericVersionOfArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("raja");
		//Type Safety
		//al.add(new Integer(10));//------------>C.E::incompactable type
		//Type casting not requirde
		String name=al.get(0);
	}

}
