package org.durgasoft.test;

public class ArraysTypeSafetyTest {
	public static void main(String[] args) {
		String[] arr=new String[3];
		arr[0]="Rama";
		arr[1]="Raja";
		//arr[2]=10; ------------>C.E:IncompactableType
	}

}
