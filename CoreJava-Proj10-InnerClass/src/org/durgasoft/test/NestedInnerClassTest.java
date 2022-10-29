package org.durgasoft.test;

public class NestedInnerClassTest {
	class InnerFirst{
		class InnerSecond{
			public void m1() {
				System.out.println("NestedInnerClassTest.InnerFirst.InnerSecond.m1()");
			}
		}
	}
	public static void main(String[] args) {
		new NestedInnerClassTest().new InnerFirst().new InnerSecond().m1();
	}

}
