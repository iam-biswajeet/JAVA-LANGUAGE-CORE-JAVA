package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable{
	int x=10;
	 
}
class Cat1 implements Serializable{
	int y=20;
}
class Rat1 implements Serializable{
	int z=30;
}

public class MutipleObjectSerializedTest {
	public static void main(String[] args) throws Exception {
		Dog1 d1=new Dog1();
		Cat1 c1=new Cat1();
		Rat1 r1=new Rat1();
		FileOutputStream fos=new FileOutputStream("2.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		FileInputStream fis=new FileInputStream("2.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1)ois.readObject();
		System.out.println(d2.x);
		Cat1 c2=(Cat1)ois.readObject();
		System.out.println(c2.y);
		Rat1 r2=(Rat1)ois.readObject();
		System.out.println(r1.z);
		
		
		
	}

}
