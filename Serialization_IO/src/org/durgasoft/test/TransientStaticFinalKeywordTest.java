package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientStaticFinalKeywordTest{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Cat c1=new Cat();
		FileOutputStream fos=new FileOutputStream("1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		FileInputStream fis=new FileInputStream("1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cat c2=(Cat)ois.readObject();
		System.out.println(c2.x+"  "+c2.y+"  "+c2.z);
	}
}
class Cat implements Serializable{
	transient  static int x=10;
	transient final int y=20;
	transient int z=30;
}