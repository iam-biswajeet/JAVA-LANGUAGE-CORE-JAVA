package org.durgasoft.test;

public class MethodLocalInnerClassTest {
	public void m1() {
		class Inner7{
			public void sum(int x,int y) {
				System.out.println("sum::"+(x+y));
			}
		}
		Inner7 i=new Inner7();
		i.sum(1, 2);
		i.sum(10,20);
		i.sum(100, 200);
	}
	public static void main(String[] args) {
		new MethodLocalInnerClassTest().m1();
	}
}
