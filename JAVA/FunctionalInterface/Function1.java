package com.FunctionInterface;

@FunctionalInterface

interface sayable1{
	void say(String msg);
//abstract method
//it can conatain any number of object class meth ods.

int hashCode();
String toString();
boolean equals(Object obj);
}

public class Function1 {
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Function1 file=new Function1();
		file.say("Hello there");
		}

}
