package org.durgasoft.test;
enum Person{
	RAJA,RAMA,BAPUNI;
	Person(){
		System.out.println("I am A person");
	}
}
public class EnumConstructorTest {
	public static void main(String[] args) {
		Person p=Person.RAMA;
		System.out.println("Java Is Awesome");
	}

}
