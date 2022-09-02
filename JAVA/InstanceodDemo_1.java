package com.ust;
class Fruitt{}
class Vehiclee{}
public class InstanceodDemo_1 {
	
	public static void main(String args[]) {
		Fruit apple=new Fruit();
		Vehicle car=new Vehicle();
		System.out.println("car IS a fruit: "+ (apple instanceof Fruit));
		
		
	}
	
}
