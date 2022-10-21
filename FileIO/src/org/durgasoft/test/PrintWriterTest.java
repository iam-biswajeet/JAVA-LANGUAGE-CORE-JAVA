package org.durgasoft.test;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("3.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println(10.5);
		pw.println('a');
		pw.println("I love My india");
		pw.flush();
		pw.close();
	}

}
