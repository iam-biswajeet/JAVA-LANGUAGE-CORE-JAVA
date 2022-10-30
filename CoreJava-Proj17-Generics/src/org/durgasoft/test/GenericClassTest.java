package org.durgasoft.test;
class TypeDemo<T>{
	private T t;
	public TypeDemo(T t) {
		this.t=t;
	}
	public  void show() {
		System.out.println(t.getClass().getName());
	}
	public T getInstance() {
		return t;
	}
}
public class GenericClassTest {
	public static void main(String[] args) {
		TypeDemo<String> t1=new TypeDemo<String>("rama");
		System.out.println(t1.getInstance());
		t1.show();
		System.out.println("=========================================");
		TypeDemo<Integer> t2=new TypeDemo<Integer>(1);
		System.out.println(t2.getInstance());
		t2.show();
		System.out.println("============================================");
		TypeDemo<Double> t3=new TypeDemo<Double>(10.5);
		System.out.println(t3.getInstance());
		t3.show();
		System.out.println("=========================================");
		
	}

}
