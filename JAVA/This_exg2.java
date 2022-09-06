package com.exg;

 class Test_this {
	 void print()
	 {
		 //calling functionshow()
		 this.show();
		 System.out.println("Test_this::print");
		
	 }
	 void show() {
		 System.out.println("Test_this::show");
		 
	 }
	 class This_exg2{
		 public static void main(String args[]) {
			 Test_this t1 =new Test_this();
			 t1.print();
			 
		 }
	 }

}
