package com.nt.test;

import java.io.File;

public class Test06 {
	public static void main(String[] args) {
		int count=0;
		File dir=new File("G:/");
		String[] fileList=dir.list();
		for(String file:fileList) {
			File f=new File(dir,file);
			//if(f.isFile())
			if(f.isDirectory())
			{
		count++;
			System.out.println(file);
			}
			
		}
		System.out.println("NO Of File::"+count);
	}

}
