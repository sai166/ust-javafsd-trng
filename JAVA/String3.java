package com.exg;

public class String3 {
	public static void main(String[] args) {
		String str1="C++ programing";
		// all occurrences of"c++" is replaced with "Java"
		System.out.println(str1.replace("C++","Java"));  // java programing
		
		//all occurences of "aa" is replaced with "zz"
		System.out.println("aa bb aa zz".replace("aa","zz"));//zz bb zz zz
		
		//substring not in the string
		System.out.println("Java".replace("C++","C"));//
	
		
	}

}
