package com.ForEach;

//A simple program to test Interface default
//method in java

interface TestInterface{
	//abstract method
	public void square(int a);
	
	//default method
	default void show()
	{
		System.out.println("Default Method Executed");
	}
}

public class DefaultStatic implements TestInterface {
	//Implemenations of squqare abstract method
	public void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		DefaultStatic d=new  DefaultStatic();
		d.square(4);
		
		//default method executed
		d.show();
	}

}
