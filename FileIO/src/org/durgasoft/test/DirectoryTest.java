package org.durgasoft.test;

import java.io.File;
import java.io.IOException;

public class DirectoryTest {
	public static void main(String[] args) throws IOException {
		File dir=new File("biswa1");
		System.out.println(dir.exists());
		dir.mkdir();
		System.out.println(dir.exists());
	}
}
