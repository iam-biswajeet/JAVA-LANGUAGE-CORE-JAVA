package org.durgasoft.test;

class Outer5{
	class Inner5{
		public void m1() {
			System.out.println("Outer.Inner.m1()");
		}
	}
}
public class NormalInnerClassTest {
	public static void main(String[] args) {
		new Outer5().new Inner5().m1();
	}
}
