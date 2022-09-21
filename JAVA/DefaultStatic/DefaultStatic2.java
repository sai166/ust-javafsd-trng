package com.ForEach;

public class DefaultStatic2 {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();vehicle.print();
		
	}

}

interface Vehicle{
	default void print() {
		System.out.println("I am a vechile!");
	}
	static void blowHorn() {
		System.out.println("Blowing Horn!!!");
	}
}

interface FourWheeler{
	default void print() {
		System.out.println("I am a four Wheller");
	}
}

class Car implements Vehicle,FourWheeler{
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}