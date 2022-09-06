package com.exg;

public class Expection_ex {

	
	public static void main(String[] args) {
		
		try {
			//code that generates exceptions
			int divideByzero=5/0;
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("ArirhmeticException=>"+e.getMessage());
		}
	}
}
