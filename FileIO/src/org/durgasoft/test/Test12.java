package org.durgasoft.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test12 {
	public static void main(String[] args) throws IOException{
		PrintWriter pw=new PrintWriter("6.txt");
		BufferedReader br=new BufferedReader(new FileReader("src/org/durgasoft/test/4.txt"));
		
		String line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		 br=new BufferedReader(new FileReader("src/org/durgasoft/test/5.txt"));
		line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
