package org.durgasoft.test;

import java.text.NumberFormat;
import java.util.Locale;

public class SettingMaximumAndMinimumDigitTest {
	public static void main(String[] args) {
		double d1=123456.789;
		double d2=123.4;
		double d3=1.13;
		NumberFormat nf1=NumberFormat.getInstance(new Locale("en","US"));
		nf1.setMaximumFractionDigits(2);
		System.out.println(nf1.format(d1));
		System.out.println(nf1.format(d2));
		nf1.setMinimumFractionDigits(2);
		System.out.println(nf1.format(d1));
		System.out.println(nf1.format(d2));
		nf1.setMaximumIntegerDigits(5);
		System.out.println(nf1.format(d1));
		System.out.println(nf1.format(d3));
		nf1.setMinimumIntegerDigits(4);
		System.out.println(nf1.format(d1));
		System.out.println(nf1.format(d3));
		
	}

}
