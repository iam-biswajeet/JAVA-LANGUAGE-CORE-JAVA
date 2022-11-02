package org.durgasoft.test;

import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Properties;

public class SystemPropertyTest {
	public static void main(String[] args) {
		Properties p=System.getProperties();
		Enumeration e1=p.elements();
		Enumeration e2=p.propertyNames();
		while(e1.hasMoreElements() & e2.hasMoreElements()) {
			String s1=(String)e1.nextElement();
			String s2=(String)e2.nextElement();
			System.out.println(s2+"  "+s1);
		}
	}

}
