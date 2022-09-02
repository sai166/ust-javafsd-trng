package com.ust;
class Fruit{}
class Vehicle{}
public class InstanceodDemo {
	public static void main(String[]args)
	{
		Fruit pineapple=new Fruit();
		Vehicle truck=new Vehicle();
		System.out.println("pineapple IS A fruit:"+ (pineapple instanceof Fruit));
		System.out.println("truck IS A vehicle:"+ (truck instanceof Vehicle));
		
	}

}
