package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account3 implements Serializable{
	String userName="biswajit";
	String pwd="sahoo";
	int pin=2538;
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String epwd="abc"+pwd;
		oos.writeObject(epwd);
		/*
		 * int epin=4444+pin; oos.writeInt(epin);
		 */
	}
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.readObject();
		String epwd=(String)ois.readObject();
		pwd=epwd.substring(3);
		/*
		 * int epin=ois.readInt(); pin=epin-4444;
		 */
	}
}

public class CustomizedSerializationWithPrimitiveTest {
	public static void main(String[] args) throws Exception{
		Account3 ac1=new Account3();
		System.out.println(ac1.userName+"  "+ac1.pwd+"  "+ac1.pin);
		FileOutputStream fos=new FileOutputStream("7.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ac1);
		FileInputStream fis=new FileInputStream("7.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		//Account3 ac2=(Account3)ois.readObject();
		Account3 ca2=(Account3)ois.readObject();
		//System.out.println(a2.userName+"  "+a2.pwd+"  "+a2.pin);
				
	}
}
