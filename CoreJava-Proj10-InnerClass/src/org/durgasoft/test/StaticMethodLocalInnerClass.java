package org.durgasoft.test;

public class StaticMethodLocalInnerClass {
	int x=10;
	static int y=20;
	public static void m1() {
		class Inner8{
			public void m2() {
				//System.out.println(x);
				System.out.println(y);
			}
		}
		new Inner8().m2();
		
	}
	public static void main(String[] args) {
		new StaticMethodLocalInnerClass().m1();
	}

}
