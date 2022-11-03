package org.durgasoft.test;

public enum FishEnum {
	GOLD,GUPPY,STAR,APOLO;
	public static void main(String[] args) {
		FishEnum[] f=FishEnum.values();
		for(FishEnum f1:f) {
			System.out.println(f1+"  "+f1.ordinal());
		}
	}
}
