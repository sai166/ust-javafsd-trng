package com.ust2;


//java program to illustrate the concept
//of Autoboxing and unboxing

//importing requried classes
import java.io.*;
 class Boxing {
	 // Main driver method
	 public static void main(String[] args)

	 {
		 //creating an integer object
		 //with custom value say it be 10
		 
		 Integer i=new Integer(10);
		 
		 //Unboxing the object
		 
		int i1=1;
		//print statements
		System.out.println("value ofi:"+i);
		System.out.println("value of i1:"+i1);
		
		
		//Autoboxing of character
		Character X ='a';
		
		//Auto-unboxing of character
		char ch=X;
		
		//print statements
		System.out.println("value of ch:"+ch);
		System.out.println("valueof X:"+X);
		
		
	 }

}
