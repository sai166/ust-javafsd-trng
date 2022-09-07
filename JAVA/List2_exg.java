package com.ust3;
import java.util.ArrayList;
 class List2_exg {
	 
	 public static void main(String[] args) {
		 ArrayList<String>language=new ArrayList<>();
		 
		 //add elements in the array list
		 language.add("java");
		 language.add("Kotlin");
		 language.add("c++");
		 System.out.println("ArrayList:"+language);
		 
		 
		 //changes the elements of the array list
		 language.set(2,"javaScript");
		 System.out.println("Modified ArrayList:"+language);
	 }

}
