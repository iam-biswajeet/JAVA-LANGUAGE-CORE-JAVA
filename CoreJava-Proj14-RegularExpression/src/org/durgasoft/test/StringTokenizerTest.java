package org.durgasoft.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizer st1=new StringTokenizer("durga software Solution");
		StringTokenizer st2=new StringTokenizer("www.durgasoft.com","[.]");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
	}

}
