package com.ust2;

import com.ust2.Abstract;
import com.ust2.Main;

abstract class Abstract {
	//method of abstract class
	public void display() {
		System.out.println("This is java programing language");
		
	}

}
class Main extends Abstract{
	
	public static void main(String[] args) {
		
		
		//create an object of main
		Main obj =new Main();
		
		
		//access method of abstract class
		//using object of main class
		obj.display();
	}
	
	
}
