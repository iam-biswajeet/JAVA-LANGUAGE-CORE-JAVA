package org.durgasoft.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) throws IOException {
		BufferedWriter writer=new BufferedWriter(new FileWriter("2.txt"));
		writer.write(100);
		writer.newLine();
		writer.write(new char[] {'a','b','c','d'});
		writer.newLine();
		writer.write("biswajit");
		writer.flush();
		writer.close();
	}
}
