package com.exg;
//Java String indexof() with only one parameter
public class String4 {
public static void main(String[] args) {
	String str1="Learn Java";
	int result;
	
	//getting index of character'J'
	result=str1.indexOf("J");
	System.out.println(result);//6
	
	
	//the first occurence of'a' is returned
	result=str1.indexOf("a");
	System.out.println(result);//2
	
	//character not in the string
	result=str1.indexOf("j");
	System.out.println(result);//-1
	
	//getting the index of java"ava"
	result=str1.indexOf("ava");
	
	System.out.println(result);//7
	//Substring not in the string
	
	result=str1.indexOf("java");
	
	System.out.println(result);//-1
	
	
	//index of empty string in the string
	result=str1.indexOf("");
	
	
	System.out.println(result);//0
	
	
	
	
}
}
