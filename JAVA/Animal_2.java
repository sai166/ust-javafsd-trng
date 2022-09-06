package com.exg;

class Animals3{
	Animals3(){
		System.out.println("i am an animal");
	}
	}
class Dogdog extends Animals3{
	//default  or- non arg constructor of class Dog
	Dogdog(){
		//calling default constructor of the superclass
		super();
		System.out.println("i am a dog");
		
	}
}

 class Animal_2 {
	 public static void main(String agrs[]) {
		 Dogdog dog1=new Dogdog();
	 }

}
