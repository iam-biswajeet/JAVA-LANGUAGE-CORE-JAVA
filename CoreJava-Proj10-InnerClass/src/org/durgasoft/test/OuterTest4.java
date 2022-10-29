package org.durgasoft.test;

public class OuterTest4 {
	class Inner4{
		public void m1() {
			System.out.println("OuterTest4.Inner4.m1()");
		}
	}
	public void m2() {
		System.out.println("OuterTest4.m2()");
		new Inner4().m1();
	}
	public static void main(String[] args) {
		OuterTest4 o=new OuterTest4();
		o.m2();
	}

}
