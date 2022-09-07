package com.ust3;


// java program to show multplie
//type parameter in java generics
//we use<> to specific parameter type

class Test<T,U>{
	
	T obj1;//An object of type T
	U obj2;// An object of type u
	//constructor
	Test(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
		
		}
	
	
	//to print object of T and U
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}

//Drivrn class to test above


class Generics {
	 public static void main(String[] args) {
		Test<String,Integer>obj=new Test<String,Integer>("GfG",15);
		obj.print();
	}

}
