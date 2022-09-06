package com.ust2;

class Animaldog{
	//method in the superclass
	public void eat() {
		System.out.println("I can eat");
	}
}
//Dog inherits animal
class Dog extends Animaldog{
	
	//overriding the eat() method
	@Override
	public void eat() {
		
		// call method to superclass
		super.eat();
		System.out.println("I eat dog food");
		
	}
	
	// new method in subclass
	public void brak() {
		System.out.println("I can bark");
	}
}


 class Super {
public static void main(String[] args) {
	
	//create an object of the subclass
	Dog labrador= new  Dog();
	//call the eat() method
	labrador.eat();
	labrador.brak();
}
}
