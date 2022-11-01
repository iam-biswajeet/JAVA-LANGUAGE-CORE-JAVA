package org.durgasoft.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDifferentStyleTest {
	public static void main(String[] args) {
		DateFormat df1=DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
		DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
		DateFormat df3=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.US);
		DateFormat df4=DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));
		System.out.println(df3.format(new Date()));
		System.out.println(df4.format(new Date()));
	}
}
