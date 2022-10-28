package org.durgasoft.test;

public class HeapMemoryTest {
	
	public static void main(String[] args) {
		long mb=1024*1024;
		Runtime r=Runtime.getRuntime();
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println("Consumed MEmory:: "+(r.totalMemory()-r.freeMemory())/mb);
	}
}
