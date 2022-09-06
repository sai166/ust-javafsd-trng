package com.exg;

 class Animaldog1 {
	 protected String type="animal";
}
 class Dog1 extends Animaldog1{
	 public String type="mammal";
	 public void printType() {
		 System.out.println("i am a "+type);
		 System.out.println("i am a "+super.type);
		 
	 }
 }
class Animal_1{
	public static void main(String args[]) {
		Dog1 dog1=new Dog1();
		dog1.printType();
		
	} 
}