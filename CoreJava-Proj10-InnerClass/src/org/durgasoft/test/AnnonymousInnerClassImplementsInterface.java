package org.durgasoft.test;

public class AnnonymousInnerClassImplementsInterface {
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("innerClass");
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main");
		}
	}

}
