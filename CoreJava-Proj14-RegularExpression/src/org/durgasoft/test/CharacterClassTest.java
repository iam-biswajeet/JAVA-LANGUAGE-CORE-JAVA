package org.durgasoft.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassTest {
	public static void main(String[] args) {
		String s1="[abc]";
		String s2="[^abc]";
		String s3="[a-z]";
		String s4="[A-Z]";
		String s5="[a-zA-z]";
		String s6="[0-9]";
		String s7="[a-zA-z0-9]";
		String s8="[^a-zA-z0-9]";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher("a1b $z@9aa c");
		while(m.find()) {
			System.out.println(m.start()+"  "+m.group());
		}
	}
}
