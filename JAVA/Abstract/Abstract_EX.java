package com.ust;

 abstract class Abstract1{
	int age;
	String name;
	String address;
	void display() {
		System.out.println(age+" "+address+" "+name);
	
	}
	int show() {
	return 0;
}
	 abstract float calculate();
	 abstract void chech();
	}
 


   abstract public class Abstract_EX extends Abstract1 {
	 float calculate() {
		 return 0f;
	 }
	 void check() {

}
   }
