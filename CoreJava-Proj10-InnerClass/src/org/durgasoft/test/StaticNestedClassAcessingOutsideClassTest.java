package org.durgasoft.test;

public class StaticNestedClassAcessingOutsideClassTest {
	public static void main(String[] args) {
		Outer2.Nested2 n=new Outer2.Nested2();
		n.m1();
	}
}
class Outer2{
	static class Nested2{
		public void m1() {
			System.out.println("StaticNestedClassAcessingOutsideClass.Nested2.m1()");
		}
	}

}
