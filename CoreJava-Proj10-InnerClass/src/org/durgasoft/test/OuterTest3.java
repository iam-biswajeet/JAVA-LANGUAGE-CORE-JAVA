package org.durgasoft.test;

public class OuterTest3 {
	class Inner3{
		public void m1() {
			System.out.println("OuterTest3.Inner3.m1()");
		}
	}
	public static void main(String[] args) {
		OuterTest3 o=new OuterTest3();
		OuterTest3.Inner3 i=o.new Inner3();
		i.m1();
	}
}
