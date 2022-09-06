package com.ust2;



abstract class Motorbike {
	abstract void brake();
	

}


class SportsBike extends Motorbike{
	//implementation of abstract method
	
	public void brake() {
		System.out.println("SportsBile");
	}


}


class MountainBike extends Motorbike{
	//implementation of abstract method
	
	public void brake() {
		System.out.println("MountainBike Brake");
	}
}

class Abstract3{
	
	public static void main(String[] args) {
		MountainBike m1=new MountainBike();
		m1.brake();
		SportsBike s1 = new SportsBike();
		s1.brake();
		
		
		
	}
	
}