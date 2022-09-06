package com.exg;

public class Final3_exg {
//create a final method
	public static void  display() {
		System.out.println("This is a final method.");
		
	}
}
class Main extends Final3_exg{
	//try to override final method
	public static void display() {
		System.out.println("The final method is overridden.");
	}
	public static void main(String[] args) {
		Main obj= new Main();
		obj.display();
	}
}