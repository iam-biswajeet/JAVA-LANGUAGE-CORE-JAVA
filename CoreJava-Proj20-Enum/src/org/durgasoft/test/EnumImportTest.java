package org.durgasoft.test;
import static org.durgasoft.service.Grade.F;
import org.durgasoft.service.Grade;
public class EnumImportTest {
	public static void main(String[] args) {
		Grade g=Grade.A;
		System.out.println(g);
		System.out.println(F);
	}
}
