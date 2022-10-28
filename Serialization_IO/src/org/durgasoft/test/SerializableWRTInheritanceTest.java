package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	int x=10;
	
}
class Student extends Person {
	int y=20;
	
}
public class SerializableWRTInheritanceTest {
	public static void main(String[] args) throws Exception {
		Student s1=new Student();
		System.out.println(s1.x+"  "+s1.y);
		FileOutputStream fos=new FileOutputStream("8.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		FileInputStream fis=new FileInputStream("8.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student)ois.readObject();
		System.out.println(s2.x+"  "+s2.y);
	}

}
