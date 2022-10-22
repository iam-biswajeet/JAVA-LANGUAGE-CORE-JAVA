package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog3 implements Serializable{
	Cat3 c=new Cat3();
}
class Cat3 implements Serializable{
	Rat3 r=new Rat3();
}
class Rat3 implements Serializable{
	int x=10;
}

public class ObjectGraphSerializationTest {
	public static void main(String[] args) throws Exception{
		Dog3 d1=new Dog3();
		FileOutputStream fos=new FileOutputStream("3.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis=new FileInputStream("3.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog3 d2=(Dog3)ois.readObject();
		System.out.println(d2.c.r.x);
	}

}
