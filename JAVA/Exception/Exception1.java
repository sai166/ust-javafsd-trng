package com.Exception;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//code that generated exception
			
			int dividedBYZero =5/0;
			System.out.println("Rest of code in try block");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException=>"+e.getMessage());
		}

	}

}
