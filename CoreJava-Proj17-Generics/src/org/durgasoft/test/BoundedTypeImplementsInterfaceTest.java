package org.durgasoft.test;

public class BoundedTypeImplementsInterfaceTest<T extends Runnable> {
	public static void main(String[] args) {
		BoundedTypeImplementsInterfaceTest<Runnable> t1=
				new BoundedTypeImplementsInterfaceTest<Runnable>();
		BoundedTypeImplementsInterfaceTest<Thread> t2=
									new BoundedTypeImplementsInterfaceTest<Thread>();
		/*
		 * BoundedTypeImplementsInterfaceTest<String> t3= new
		 * BoundedTypeImplementsInterfaceTest<String>();
		 */
	}

}
