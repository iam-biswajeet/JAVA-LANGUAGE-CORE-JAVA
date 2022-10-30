package org.durgasoft.test;

public class BoundedTypeParameterTest<T extends Number> {
	public static void main(String[] args) {
		BoundedTypeParameterTest<Integer> t1=new BoundedTypeParameterTest<Integer>();
		//BoundedTypeParameterTest<String> t2=new BoundedTypeParameterTest<String>();
	}

}
