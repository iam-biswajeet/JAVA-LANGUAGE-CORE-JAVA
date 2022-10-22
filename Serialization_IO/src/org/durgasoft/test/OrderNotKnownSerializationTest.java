package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog2 implements Serializable{
	int x=10;
	 
}
class Cat2 implements Serializable{
	int y=20;
}
class Rat2 implements Serializable{
	int z=30;
}

public class OrderNotKnownSerializationTest {
	public static void main(String[] args)  {
		try {
		Dog2 d1=new Dog2();
		Cat2 c1=new Cat2();
		Rat2 r1=new Rat2();
		FileOutputStream fos=new FileOutputStream("3.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		FileInputStream fis=new FileInputStream("3.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		while(obj!=null) {
		if(obj instanceof Dog2) {
			
		Dog2 d2=(Dog2)obj;
		System.out.println(d2.x);
		}
		
		if(obj instanceof Cat2) {
			
			Cat2 d2=(Cat2)obj;
			System.out.println(d2.y);
			}
		
		if(obj instanceof Rat2) {
			
			Rat2 d2=(Rat2)obj;
			System.out.println(d2.z);
			}
		obj=ois.readObject();
		}
		}
		catch(Exception e) {}
		
	}

}
