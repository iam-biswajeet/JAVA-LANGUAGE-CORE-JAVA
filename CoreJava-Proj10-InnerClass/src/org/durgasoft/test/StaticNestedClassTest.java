package org.durgasoft.test;

public class StaticNestedClassTest {
	static class Nested1{
		public void m1() {
			System.out.println("StaticNestedClassTest.Nested1.m1()");
		}
	}
	public static void main(String[] args) {
		Nested1 n=new Nested1();
		n.m1();
	}

}
