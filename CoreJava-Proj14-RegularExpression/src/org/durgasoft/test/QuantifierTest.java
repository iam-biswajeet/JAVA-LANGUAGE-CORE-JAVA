package org.durgasoft.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierTest {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a+";
		String s3 = "a*";
		String s4 = "a?";
		Pattern p = Pattern.compile(s4);

		Matcher m = p.matcher("abaabaaabaa");
		while (m.find()) {
			System.out.println(m.start() + "        " + m.group());
		}
	}

}
