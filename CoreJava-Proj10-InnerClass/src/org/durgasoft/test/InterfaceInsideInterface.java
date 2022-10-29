package org.durgasoft.test;

public interface InterfaceInsideInterface {
	
}
interface Outer10{
	public void m1();
	interface Inner10{
		public void m2();
	}
}
class Outer10Impl implements Outer10{
	@Override
	public void m1() {
	
	}
}
class Inner10Impl implements Outer10.Inner10{
	@Override
	public void m2() {
	
	}
	
}

