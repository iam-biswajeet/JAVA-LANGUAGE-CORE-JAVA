package org.durgasoft.test;

import java.util.regex.*;
public class EmailValidationTest{
	public static void main(String[] args){
	Pattern p=Pattern.compile("[A-Za-z0-9]+[a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
		Matcher m=p.matcher(args[0]);
		if(m.find() && m.group().equals(args[0])){
			System.out.println("Valid Email ");
		}
		else{
			System.out.println("Not a Valid Email ");
		}
	}
}
