package org.durgasoft.test;

import java.security.DomainCombiner;

public class InstanceMethodLocalInnerClass {
	int x=10;
	static int y=20;
	public void m1() {
		class Inner8{
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		new Inner8().m2();
		
	}
	public static void main(String[] args) {
		new InstanceMethodLocalInnerClass().m1();
	}

}
