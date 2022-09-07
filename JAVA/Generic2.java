package com.ust3;


	//Java program to show working
	//of user-defuned generic classes
	
	//we use<> to specify parameter type

class Testtest<T>{
	//An object of type T  is declared
	T obj;
	Testtest(T obj){this.obj =obj;}//constructor
	
	public T getObject() {return this.obj;}
}
//Driven class to test above
class Generic2{
	public static void main(String[] args) {
		
		//instance of integer type
		Testtest<Integer>iObj = new Testtest<Integer>(15);
		
		System.out.println(iObj.getObject());
		
		//instance of string type
		 Testtest<String>sObj = new Testtest<String>("GeeksForGeeks");
		 
		 System.out.println(sObj.getObject());
		 
		// iObj= Obj;
		 //this result an error
	}
}
	


