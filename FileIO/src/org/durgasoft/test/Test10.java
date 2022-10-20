package org.durgasoft.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test10 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader("2.txt"));
		String line=reader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=reader.readLine();
		}
	}

}
