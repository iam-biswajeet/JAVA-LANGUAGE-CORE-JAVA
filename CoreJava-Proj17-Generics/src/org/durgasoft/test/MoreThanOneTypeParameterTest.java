package org.durgasoft.test;

public class MoreThanOneTypeParameterTest<X,Y,Z> {
	X x;
	Y y;
	Z z;
	
	public Y getY() {
		return y;
	}

	public void setY(Y y) {
		this.y = y;
	}

	public Z getZ() {
		return z;
	}

	public void setZ(Z z) {
		this.z = z;
	}

	public void setX(X x) {
		this.x = x;
	}

	public X getX() {
		return x;
	}
}
