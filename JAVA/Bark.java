package com.ust2;

abstract class Animal6{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat.");
	}
}

class Dogg extends Animal6{
	
	//prvide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}


class Bark{
	public static void main(String[] args) {
		
		//create an object of dog class
		Dogg d1 =  new Dogg();
		
		d1.makeSound();
		d1.eat();
	}
}