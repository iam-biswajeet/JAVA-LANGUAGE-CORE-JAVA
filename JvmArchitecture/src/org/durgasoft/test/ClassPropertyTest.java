package org.durgasoft.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class Student{
	String sname;
	private int rollNo;
	public String getName() {
		return sname;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
}
public class ClassPropertyTest {
	public static void main(String[] args) {
		Student s=new Student();
		Class c=s.getClass();
		System.out.println(c);
		Method[] m=c.getDeclaredMethods();
		System.out.println(Arrays.toString(m));
		Field[] f=c.getDeclaredFields();
		System.out.println(Arrays.toString(f));
		
	}

}
