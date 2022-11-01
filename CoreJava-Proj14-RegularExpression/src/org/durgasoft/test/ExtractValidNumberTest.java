package org.durgasoft.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.module.ModuleFinder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractValidNumberTest {
	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter("output1.txt");
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		BufferedReader br=new BufferedReader(new FileReader("E:/Public/input.txt"));
		String line=br.readLine();
		while(line!=null) {
			Matcher m=p.matcher(line);
			while(m.find()) {
				pw.println(m.group());
				
			}
			line=br.readLine();
			pw.flush();
		}
		pw.close();
	}

}