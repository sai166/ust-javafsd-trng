package com.exg;

class Animaldog{
	//default or no_arg constructor
	Animaldog(){
		System.out.println("i am aanimal");
	}
	
	//parameterized constructor
	Animaldog(String type){
		
		System.out.println("Type:"+type);
		
	}
}
class Dog2 extends Animaldog{
	//default constructor
	Dog2(){
		//calling parameterized constructor of the super class
		super("animal");
		System.out.println("i am a dog");
	}
}
class Animal_3{
	public static void main(String args[]) {
		Dog2 dog1=new Dog2();
	}
}