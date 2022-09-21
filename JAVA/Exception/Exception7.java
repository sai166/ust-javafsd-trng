package com.Exception;

//java program that demonstrates the use of the trows
public class Exception7 {
	
	 public static void fun()
	{
		try {
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException e)
	
		{	
		System.out.println("caught inside fun().");
		
		throw e;//rethrowing the exception
		
	}
	
}
public static void main(String[] args) {
	try {
		fun();
		
	}

	catch(NullPointerException e) {
		System.out.println("caught in main.");
	}
	
	
}
}

