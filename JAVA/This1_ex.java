package com.ust2;


//java code for using this()to
//invoke current class constructor
public class This1_ex {
	
	
	int a;
	int b;
	//Default constructor
	This1_ex(){
		this(10,20);
		System.out.println("Inside default constructor\n");
	}
	//parameterized constructor
	This1_ex(int a,int b){
		this.a=a;
		this.b=b;
		
		System.out.println("Inside parameterized constructor");
	}
	public static void main(String[] args) {
		This1_ex object =new This1_ex();
		
	}

}
