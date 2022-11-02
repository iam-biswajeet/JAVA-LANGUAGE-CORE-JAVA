package org.durgasoft.test;

public class SwitchVsEnumTest {
	public static void main(String[] args) {
		Beer b=Beer.OC;
		switch (b) {
		case RS:
			System.out.println("It is for Children");
			break;
		case OC:
			System.out.println("It is Soft Drink");
			break;
		case BL:
			System.out.println("It is Not Good For Health");
			break;
		case KF:
			System.out.println("It is outdated");
			break;
		default:
			System.out.println("No comment");
			break;

		}
	}

}
