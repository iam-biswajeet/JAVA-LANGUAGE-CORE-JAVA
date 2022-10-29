package org.durgasoft.test;

public class Outer_ThisKeywordTest {
	int x=100;
	class Inner6{
		int x=10;
		public void m1() {
			int x=1;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer_ThisKeywordTest.this.x);
			
		}
	}
	public static void main(String[] args) {
		new Outer_ThisKeywordTest().new Inner6().m1();
	}

}
