package org.durgasoft.test;

import java.io.File;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException{
		File file=new File("abc.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		long size=file.length();
		System.out.println("No Of Char::"+size);
	}
}
