package com.ust2;

//java code for using 'this' keyword
//to return the current class instance

public class Thsi2_ex {
	int a;
	 int b;
	 
	 //default constructor
	 Thsi2_ex()
	 {
		 a=10;
		 b=20;
		 
	 }
	 
	 
	 //Method that returns current class insatnace
	 
	 Thsi2_ex get() 
	 {
		 return this;
	 }
//Displaying value of variable a and b
	 void display() {
		 System.out.println("a="+a+"b="+b);
		 
		 
	 }
	 public static void main (String args[]) {
		 Thsi2_ex object=new Thsi2_ex();
		 object.get().display();
	 }
}
