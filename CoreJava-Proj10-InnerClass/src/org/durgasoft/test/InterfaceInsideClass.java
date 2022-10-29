package org.durgasoft.test;
class VehicleType{
	interface Vehicle{
		public int getNoOfWheel() ;
	}
	class Bus implements Vehicle{

		@Override
		public int getNoOfWheel() {
			return 8;
		}
		
	}
	class Auto implements Vehicle{
		@Override
		public int getNoOfWheel() {
			return 3;
		}
	}
}
public class InterfaceInsideClass {

}
