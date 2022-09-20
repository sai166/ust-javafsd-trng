package com.Lambda;


//this is fuctional interface
@FunctionalInterface

interface MyInterface{
	
	
	//abstract method
	double getPiValue();
}
public class Lambda {
	public static void main(String[] args) {
		//declare a reference to MyInterface
		
		MyInterface ref;
		
		//lambda expression
		ref=()->3.1415;
		System.out.println("Value of pi="+ref.getPiValue());
	}

}
