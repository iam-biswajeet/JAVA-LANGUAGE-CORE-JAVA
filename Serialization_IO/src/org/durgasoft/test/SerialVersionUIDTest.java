package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rabbit implements Serializable{
	private static final long serialVersionUID=1L;
	int x=10;
	int y=20;
}
public class SerialVersionUIDTest {
	public static void main(String[] args) throws Exception {
		Rabbit r1=new Rabbit();
		System.out.println(r1.x+"  "+r1.y);
		FileOutputStream fos=new FileOutputStream("11.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(r1);
		FileInputStream fis=new FileInputStream("11.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Rabbit r2=(Rabbit)ois.readObject();
		System.out.println(r2.x+"  "+r2.y);
	}
}
