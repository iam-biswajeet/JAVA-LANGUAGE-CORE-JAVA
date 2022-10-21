package org.durgasoft.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExtractNumberTest {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("G:\\files\\output.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("G:\\files\\input.txt"));
		String line = br1.readLine();
		while (line != null) {
			boolean flag = false;
			BufferedReader br2 = new BufferedReader(new FileReader("G:\\files\\delete.txt"));
			String check = br2.readLine();
			while (check != null) {
				if (line.equalsIgnoreCase(check)) {
					flag = true;
					break;
				}
				check = br2.readLine();
			}
			if (!flag) {
				pw.println(line);
			}
			line=br1.readLine();
		}
		pw.flush();
		pw.close();
	}

}
