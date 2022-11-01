package org.durgasoft.test;

import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {
		int count=0;
		Locale d1=Locale.getDefault();
		System.out.println(d1.getDisplayCountry()+"  "+d1.getDisplayLanguage());
		Locale.setDefault(Locale.ITALY);
		Locale d2=Locale.getDefault();
		System.out.println(d2.getDisplayCountry()+"  "+d2.getDisplayLanguage());
		Locale[] locale=Locale.getAvailableLocales();
		for(Locale l:locale) {
			System.out.println(++count+"  "+l.getDisplayCountry()+"  "+l.getDisplayLanguage());
		}
	}

}
