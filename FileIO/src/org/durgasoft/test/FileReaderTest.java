package org.durgasoft.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("1.txt");
		int i=reader.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=reader.read();
		}
		System.out.println();
		System.out.println("******************************");
		File f=new File("1.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		
		fr.read(ch);
		String s=new String(ch);
		System.out.println(s);
	}

}
