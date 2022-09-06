package com.exg;

 class This_construct {
	 int val1;
	 int val2;
	 //default constructor
	 This_construct()
	 {
	this(10,20);
	System.out.println("Default constructor \n");

}
	 //parameterized constructor 
	 This_construct(int val1,int val2)
	 {
		 this.val1=val1;
		 this.val2=val2;
		 System.out.println("Parameterized constructor");
	 }
}
 class This_exg4{
	 public static void main(String args[]){
		 
		 This_construct object =new This_construct();
		 
		 
	 }
 }