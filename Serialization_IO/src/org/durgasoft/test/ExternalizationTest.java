package org.durgasoft.test;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Monkey implements Externalizable{
	public Monkey() {
		System.out.println("Monkey-No arg Constructor(-)");
	}
	int x=10;
	String name="abc";
	int y=20;
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String)in.readObject();
		x=in.readInt();
		//y=in.readInt();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(x);
		//out.writeInt(y);
		
	}
}
public class ExternalizationTest {
	public static void main(String[] args) throws Exception{
		Monkey m1=new Monkey();
		System.out.println(m1.x+"  "+m1.name);
		FileOutputStream fos=new FileOutputStream("10.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(m1);
		FileInputStream fis=new FileInputStream("10.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Monkey m2=(Monkey)ois.readObject();
		System.out.println(m2.x+"  "+m2.name);
	}

}
