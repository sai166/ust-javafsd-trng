package com.MethodReference;

interface Sayable{
	void say();
	
}

public class Method3 {
	public static void saySomething() {
		System.out.println("hellom, this is static method.");
	}

	public static void main(String[] args) {
		//referring static method
		Sayable sayable = Method3::saySomething;
		
		//CALLING INTERFACE METHOD
		sayable.say();
	}
	
}
