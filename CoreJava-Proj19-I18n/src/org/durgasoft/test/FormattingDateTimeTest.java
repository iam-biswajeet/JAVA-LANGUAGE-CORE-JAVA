package org.durgasoft.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormattingDateTimeTest {
	public static void main(String[] args) {
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,new Locale("en","IN"));
		System.out.println(df.format(new Date()));
	}

}
