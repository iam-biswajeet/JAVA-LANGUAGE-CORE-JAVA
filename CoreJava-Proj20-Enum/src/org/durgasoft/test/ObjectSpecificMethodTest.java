package org.durgasoft.test;
enum Color{
	BLUE,RED{
		public void info() {
			System.out.println("it is danger");
	}
	}
	,GREEN;
	public void info(){
		System.out.println("Universal color");
	}
	
}
public class ObjectSpecificMethodTest {
	public static void main(String[] args) {
		Color c1=Color.BLUE;
		c1.info();
		Color c2=Color.RED;
		c2.info();
		Color c3=Color.GREEN;
		c3.info();
	}

}
