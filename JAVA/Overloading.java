package com.ust2;

public class Overloading {
	//this method accept int
	private static void display(int a) {
		System.out.println("Got integer data.");
	}
	//this method accepts Strings object
	private static void display(String a) {
		System.out.println("Go String object.");
	}
	public static void main(String[] args) {
		display(1);
		display("Hello");
	}

}
