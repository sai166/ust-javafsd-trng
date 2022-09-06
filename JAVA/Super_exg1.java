package com.exg;

 class Animals {
	 public void display() {
		 System.out.println("i am an animal");
	 }

}
 class Dog extends Animals{
	 //overriding method
	 @Override
	 public void display() {
		 System.out.println("i am a dog");
	 }
	 public void printmessage() {
		 display();
		 
	 }
 }
class Super_exg1{
	public static void main(String args[]) {
		Dog dog1=new Dog();
		dog1.printmessage();
	}
}