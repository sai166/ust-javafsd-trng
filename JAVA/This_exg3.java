package com.exg;

 class This_exg {

	 int val_a;
	 int val_b;
	 //default constructor
	 This_exg()
	 {
		 val_a=10;
		 val_b=20;
		 
	
	 }
	 This_exg get()
	 {
		 return this;
	 }
	 void display()
	 {
		 System.out.println("val_a="+val_a+"val_b="+val_b);
	 }

}

 class This_exg3{
	 public static void main(String args[]) {
		 This_exg object=new This_exg();
		 object.get().display();
	 }
 }