package com.FunctionInterface;


//java program to demonstrate lambda expressions to
//implementration a user defined functional interface


@FunctionalInterface
interface Square{
	int calculate(int x);
}
public class Function3 {
	public static void main(String[] args) {
		int a = 5;
		//lambda expressions to define the calculate method
		Square s =(int x)->x*x;
		//parameter passed and return type must be
		
		//same as defined in the prototype type must be
		
		int ans =s.calculate(a);
		System.out.println(ans);
	}

}
