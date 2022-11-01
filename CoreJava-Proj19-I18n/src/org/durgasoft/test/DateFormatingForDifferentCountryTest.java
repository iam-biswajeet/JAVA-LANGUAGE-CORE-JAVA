package org.durgasoft.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatingForDifferentCountryTest {
	public static void main(String[] args) {

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ITALY);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));
		System.out.println(df3.format(new Date()));
	}
}
