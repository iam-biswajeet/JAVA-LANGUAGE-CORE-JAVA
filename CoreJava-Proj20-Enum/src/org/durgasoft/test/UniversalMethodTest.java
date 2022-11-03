package org.durgasoft.test;
enum Season{
	SUMMER,RAINY,WINTER;
	public void info() {
		System.out.println("Universal Season");
	}
}
public class UniversalMethodTest {
	public static void main(String[] args) {
		Season s1=Season.SUMMER;
		s1.info();
		Season s2=Season.RAINY;
		s2.info();
		Season s3=Season.WINTER;
		s3.info();
		
	}
}
