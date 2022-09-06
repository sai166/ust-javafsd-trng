package com.ust2;

class Animal5{
	protected String name;
	protected void display() {
	System.out.println("I am an animal.");
	}
}
class Dog5 extends Animal5{
	public void getiInfo1() {
		System.out.println("My name is" + name);
			
		}
	}


class GetInfo {
	public static void main(String[] args) {
		
		//create an object of the subclass
		Dog5 labrador= new Dog5();
		
		
		//access protected field and method
		//using the object of subclass
		labrador.name="Rocky";
		labrador.display();
		labrador.getiInfo1();
	}

}
