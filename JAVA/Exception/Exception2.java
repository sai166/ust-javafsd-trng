package com.Exception;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//code that generates exceptiom
			int dividedByzero=5/0;
	
		}
		catch (ArithmeticException e) {
		System.out.println("ArithmericException=>"+e.getMessage());
		}
		finally {
			System.out.println("This is the finally block");
		}

	}

}
