package org.durgasoft.test;

public class StaticNestedClassMainMethodTest {
	static class Nested{
		/*
		 * javac StaticNestedClassMainMethodTest$Nested.java java
		 * StaticNestedClassMainMethodTest$Nested
		 */
		public static void main(String[] args) {
			System.out.println("StaticNestedClassMainMethodTest.Nested.main()");
		}
	}
	
}
