package org.durgasoft.test;
class Popcorn{
	public void test(){
		System.out.println("Popcorn.test()");
	}
}
public class AnnonymousInnerClassTest {
	public static void main(String[] args) {
		Popcorn p=new Popcorn();
		p.test();
		Popcorn p1=new Popcorn() {
			public void test() {
				System.out.println("AnnonymusInnerClassTest$1.test()");
			}
		};
		p1.test();
		Popcorn p2=new Popcorn() {
			public void test() {
				System.out.println("AnnonymusInnerClassTest$2.test()");
			}
		};
		p2.test();
		System.out.println("==================================");
		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
	}

}
