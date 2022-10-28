package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent{
	public Parent() {
		System.out.println("Parent -No arg Constructor");
	}
	int x=10;
}
class Child extends Parent implements Serializable{
	int y=20;
}
public class SerializableWRTInheritance2 {
	public static void main(String[] args) throws Exception{
		Child c1=new Child();
		System.out.println(c1.x+"  "+c1.y);
		c1.x=888;
		c1.y=999;
		FileOutputStream fos=new FileOutputStream("9.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		FileInputStream fis=new FileInputStream("9.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child c2=(Child)ois.readObject();
		System.out.println(c2.x+"  "+c2.y);
	}
}
