package org.durgasoft.test;

import java.util.regex.Pattern;

public class PatternClassSplitTest {
	public static void main(String[] args) {
		Pattern p=Pattern.compile(" ");
		String[] arr=p.split("Durga Softwre Solution");
		for(String s:arr) {
			System.out.println(s);
		}
	}
}
