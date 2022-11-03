package org.durgasoft.test;
enum Animal{
	CAT(100),DOG(56),RAT;
	int price;
	Animal(int price){
		this.price=price;
	}
	Animal(){
		price=45;
	}
}
public class ParameterizedConstructorTest {
	public static void main(String[] args) {
		Animal a=Animal.CAT;
		Animal b=Animal.RAT;
		Animal c=Animal.DOG;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
