package org.durgasoft.test;

public class NormalInnerClassVariableAccessTest {
	int x=10;
	static int y=20;
	class Inner6{
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		new NormalInnerClassVariableAccessTest().new Inner6().m1();
	}

}
