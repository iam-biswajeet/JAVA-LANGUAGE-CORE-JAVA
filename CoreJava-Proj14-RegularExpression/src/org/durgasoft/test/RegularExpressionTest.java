package org.durgasoft.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	public static void main(String[] args) {
		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbabaaaba");
		while(m.find()) {
			count ++;
			System.out.println(m.start()+"  "+m.end()+"  "+m.group());
		}
		System.out.println("No of pattern 'ab' present in match::"+count);
	}

}
