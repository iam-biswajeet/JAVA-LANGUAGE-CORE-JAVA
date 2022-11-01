package org.durgasoft.test;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatTest {
	public static void main(String[] args) {
		double d=123456.789;
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.UK);
		NumberFormat nf3=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		System.out.println(nf1.format(d));
		System.out.println(nf2.format(d));
		System.out.println(nf3.format(d));	
	}

}
