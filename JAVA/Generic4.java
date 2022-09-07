package com.ust3;

public class Generic4 {
	public static void main(String[] args) {
		
		//initialize the class with integer data
		DemoClass demo = new DemoClass();
		
		
		//generic method working with string
		
		demo.<String>genericsMethod("Java programing");
		
		//generics method working with integer
		
		demo.<Integer>genericsMethod(25);
	}
}

class DemoClass{

//create a generics  method
public<T>void genericsMethod(T data){
	System.out.println("Generics Method:");
	System.out.println("Data passed:"+data);
}

}


