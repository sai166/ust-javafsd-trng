package com.ust3;

import java.util.Map;
import java.util.HashMap;
 class List3_ex {
	 public static void main(String[] args) {
		 //creating a map using the HashMap
		 Map<String,Integer>numbers=new HashMap<>();
		 
		 
		 //insert elements to the map
		 numbers.put("One",1);
		 numbers.put("Two",2);
		 System.out.println("Map:"+numbers);
		 
		 
		 //Acces keys of the map
		 System.out.println("Keys:"+numbers.keySet());
		 
		 
		 ///Access vlaue of the map
		 System.out.println("values:"+numbers.values());
		 
		 ///Access entire of the map
		 System.out.println("Entire:"+numbers.entrySet());
		 
		 
		 //Remove elements from the map
		 int value=numbers.remove("Two");
		 System.out.println("Removed Value:"+value);
		 
		 
		 
		 
		 
		 
	 }

}
