package org.durgasoft.test;

import java.io.File;
import java.io.IOException;

public class CreateFileTest  {
	public static void main(String[] args) throws IOException {
		File dir=new File("biswa2");
		dir.mkdir();
		File file=new File(dir,"1.txt");
		file.createNewFile();
		
	}
}
