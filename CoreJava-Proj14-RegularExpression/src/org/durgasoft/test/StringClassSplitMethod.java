package org.durgasoft.test;

public class StringClassSplitMethod {
	public static void main(String[] args) {
		String s=new String("www.durgaSoft.com");
		String[] arr=s.split("[.]");
		for(String s1:arr) {
			System.out.println(s1);
		}
	}

}
