package com.MethodReference;

public class Method4{

	
	public void printMsg() {
		System.out.println("Hello, this is instance method");
	}
	public static void main(String[] args) {
		Thread t2=new Thread(new Method4()::printMsg);
		t2.start();
	}
}


