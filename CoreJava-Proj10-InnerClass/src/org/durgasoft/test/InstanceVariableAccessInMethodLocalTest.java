package org.durgasoft.test;

public class InstanceVariableAccessInMethodLocalTest {
	public void m1() {
		int x=10;
		final int y=20;
		class Inner9{
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		new Inner9().m2();
	}
	public static void main(String[] args) {
		new InstanceVariableAccessInMethodLocalTest().m1();
	}
}
