package org.durgasoft.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicateTest {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("G:\\files\\op.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("G:\\files\\ip.txt"));
		String line = br1.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("G:\\files\\op.txt"));
			String check = br2.readLine();
			while (check != null) {
				if (line.equalsIgnoreCase(check)) {
					available = true;
					break;
				}
				check = br2.readLine();
			}
			if (!available) {
				pw.println(line);
				pw.flush();
			}
			line=br1.readLine();
		}
		pw.close();
	}

}
