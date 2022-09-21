package com.ForEach;


interface Sayable{
	//Default method
	default void say() {
		System.out.println("Hello,this is default method");
	}
	
	//Abstarct method
	void sayMore(String msg);

}
public class DefaultClass  implements  Sayable{
	public void sayMore(String msg) {
		//implementing abstract method
		
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultClass dm=new DefaultClass();
		dm.say();
		//calling default Method
		dm.sayMore("Work is worship");
		//calling abstract method
	}

}
