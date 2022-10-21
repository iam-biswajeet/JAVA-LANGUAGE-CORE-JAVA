package org.durgasoft.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException{
		FileWriter writer=new FileWriter("1.txt",true);
		writer.write('b');
		writer.write(new char[] {'i','s','w','a','j','i','t'});
		writer.write('\n');
		writer.write("i am looking a job in java");
		writer.flush();
		writer.close();
	}

}
