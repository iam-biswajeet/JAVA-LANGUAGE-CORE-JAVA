package org.durgasoft.test;

public class DifferentCombinationOfBoundedTypeTest {

}
class Test1<T extends Integer & Runnable>{
	
}
class Test2<T extends Integer & Runnable & Cloneable>{
	
}
/*
 * class Test3<T extends Runnable & Integer>{
 * 
 * }As first should be class
 */
class Test4<T extends Cloneable & Runnable>{
	
}
