package org.durgasoft.test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileNamePrinterTest {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-zA-Z0-9$_.]+[.]java");
		int count=0;
		File file =new File("E:/Public");
		String[] files=file.list();
		for(String s:files) {
			Matcher m=p.matcher(s);
			while(m.find()) {
				count++;
				System.out.println(m.group());
			}
			
		}
		System.out.println("No of .java File::"+count);
	}

}
