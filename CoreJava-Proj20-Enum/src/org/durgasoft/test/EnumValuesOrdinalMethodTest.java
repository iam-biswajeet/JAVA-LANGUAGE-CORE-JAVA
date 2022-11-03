package org.durgasoft.test;
enum Fish{
	STAR,GUPPY,GOLD,APOLO;
}
public class EnumValuesOrdinalMethodTest {
	public static void main(String[] args) {
		Fish[] f=Fish.values();
		for(Fish f1:f) {
			System.out.println(f1+"  "+f1.ordinal());
		}
	}

}
