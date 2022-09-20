package com.Lambda;


interface Addable1{
	int add(int a,int b);
}
public class Lambda4 {
	public static void main(String[] args) {
		//lambda expression without retiurn keyword
		
		
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
		
		
		//Lambda Expressions with return keyword.
		Addable ad2=(int a, int b)->{
			return(a+b);
		};
		System.out.println(ad2.add(100, 200));
		
	}

}
