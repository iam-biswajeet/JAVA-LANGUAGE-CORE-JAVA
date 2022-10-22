package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Dog d1=new Dog();
		FileOutputStream fos=new FileOutputStream("1.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis=new FileInputStream("1.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.x+"  "+d2.y);
	}
}
class Dog implements Serializable{
	int x=10;
	int y=20;
}