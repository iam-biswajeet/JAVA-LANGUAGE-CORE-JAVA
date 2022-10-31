package org.durgasoft.test;

public  class CouplingTest extends B{
	static int k=10;
	public static int m1(){
	return k;
	}
	public static void main(String[] args){
		//CouplingTest c=new CouplingTest();
		System.out.println(A.i);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}
class A {
	static int i=B.j;
}
class B extends A{
	static int j=CouplingTest. m1();
	static int m=CouplingTest .k;
}
