package com.ust3;

import java.util.LinkedHashMap;

 class Map_ex3 {
	 
	 public static void main(String args[]) {
		 //creating a linkedhashmap of even numbers
		 
		 LinkedHashMap<String,Integer>evenNumber=new LinkedHashMap<>();
		 evenNumber.put("Two",2);
		 evenNumber.put("Four",4);
		 System.out.println("LinkedHashMap1:"+evenNumber);
		 
		 //creating a linkedHashMap from other LinkedHashMap
		 LinkedHashMap<String,Integer>numbers=new LinkedHashMap<>(evenNumber);
		 numbers.put("Three",3);
		 System.out.println("LinkedHashMap2:"+numbers);
	 }

}
