package org.durgasoft.test;

public class StaticNestedClassAccessingVariable {
	int x=10;
	static int y=20;
	static class Nested4{
		public void m1() {
			//System.out.println(x);//cannot access instance Variable
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		Nested4 n=new Nested4();
		n.m1();
	}
}
