package com.ForEach;


interface Sayable1{
	//default method
	default void say() {
		System.out.println("Hello, this is default method");
	}
	
	//Abstarct method
	void sayMore(String msg);
	//static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}
public class DefaultStatic1  implements Sayable{
	public void sayMore(String msg) {
		//implements abstarct method
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultStatic1 dm= new DefaultStatic1();
		dm.say();
		//calling default method
		dm.sayMore("Work is workship");
		//calling abstract method
		Sayable1.sayLouder("Heloooo");
		//calling static method.
	}

}
