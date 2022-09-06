package com.exg;
//overridden method 
class Animal{
	public void display() {
		System.out.println("i am an animal");
	}
}

class Dog3 extends Animals {
	//overriding method
	@Override
	public void display() {
		System.out.println("i am a dog");
	}
	public void printMessage() {
		//this calls overriding method
		display();
		//this calls overridden method
		super.display();
		
	}
	

}
class Overriding_exg{
	public static void main(String args[]) {
		Dog3 dog1=new Dog3();
		dog1.printMessage();
	}
}