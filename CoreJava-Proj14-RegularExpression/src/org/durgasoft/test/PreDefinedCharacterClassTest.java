package org.durgasoft.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClassTest {
	
	
	public static void main(String[] args) {
		String s1="\\s";
		String s2="\\w";
		String s3="\\d";
		String s4="\\S";
		String s5="\\W";
		String s6="\\D";
		
		Pattern p=Pattern.compile(s1);
	
	Matcher m=p.matcher("a1b $z@9aa c");
	while(m.find()) {
		System.out.println(m.start()+"  "+m.group());
	}
}

}
