package com.ust3;

public class Generic3 {
	public static void main (String[] args) {
		
		//initialize generic class
		
		//with integer data
		GenericsClass<Integer>intObj=new GenericsClass<>(5);
		
		
		System.out.println("Generic Class returns:"+intObj.getData());

		//intialize generic class
		
		//with string data
		
		GenericsClass<String>stringObj=new GenericsClass<>("Java programing");
		System.out.println("Gneric Class returns:"+stringObj.getData());
		
	}

	
	
}


//create a generic class
class GenericsClass<T>{
	
	//variable of T data
	private T data;
	
	
	public GenericsClass(T data) {
		this.data=data;
	}
	
	//method that return T type variable
	
	public T getData() {
		return this.data;
	}
}