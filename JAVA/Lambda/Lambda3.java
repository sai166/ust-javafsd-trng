package com.Lambda;

import org.apache.commons.math3.analysis.function.Add;

interface Addable{
	int add(int a,int b);
}

public class Lambda3 {
	public static void main(String[] args) {
		//multiiple parameter in lambda expressions
		
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
		//multiples parameters with data type in lambda a expressions
		
		Addable ad2=(int a, int b)->(a+b);
		System.out.println(ad2.add(100,200));
	
	}

}
