package org.durgasoft.test;

import java.io.File;
import java.io.IOException;

public class CreateFileSpecifiedDirTest {
	public static void main(String[] args) throws IOException {
		File file=new File("G:\\","4.txt");
		file.createNewFile();
	}
}
