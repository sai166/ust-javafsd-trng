package com.FunctionInterface;

//java program to demonstarte implementation of
//functional interface using lambda expressions



public class Function2 {
	public static void main(String[] args) {
		
		
		//lambda expressions to create the object
		
		new Thread(()->{
			System.out.println("New thread created");
		}).start();
	}

}
