package org.durgasoft.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String userName="biswajit";
	int pwd=2538;
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", pwd=" + pwd + "]";
	}
	private void writeObject(ObjectOutputStream oos)throws Exception {
		oos.defaultWriteObject();
		String epwd="123"+pwd;
		oos.writeObject(epwd);
	}
	private void readObject(ObjectInputStream ois) throws Exception{
	ois.defaultReadObject();
	String epwd=(String)ois.readObject();
	pwd=Integer.parseInt(epwd.substring(3));
		
	}
	
}
public class CustomizedSerializationTest {
	public static void main(String[] args) throws Exception {
		Account ac1=new Account();
		System.out.println(ac1);
		FileOutputStream fos=new FileOutputStream("4.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ac1);
		FileInputStream fis=new FileInputStream("4.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account ac2=(Account)ois.readObject();
		System.out.println(ac2);
		
		
	}
}
