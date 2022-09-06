package com.ust2;



abstract class Animal{
	abstract void makeSound();
	
	public void eat() {
		
		System.out.println("I can eat.");
		
	}

}
 class Dog8 extends Animal{
	//provide implementation of abstract method
	public void makeSound() {
		
		System.out.println("Bark bark");
	}
}
class Abstract2{
	public static void main(String[] args) {
		//create an object of Dog class
		Dog8 d1 =new Dog8();
		
		
		d1.makeSound();
		d1.eat();
	}
}
