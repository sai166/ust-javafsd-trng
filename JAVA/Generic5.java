package com.ust3;

class GenericsClass1<T extends String>{
	public void display() {
		System.out.println("This is a bounded type generics class.");
	}
}



public class Generic5 {
	public static void main(String[] args) {
		//create an object of generic class
		GenericsClass1<String> obj = new GenericsClass1<>();
	}

}
