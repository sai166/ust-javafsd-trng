package com.ust3;

import java.util.Map;
import java.util.TreeMap;

 class Map_ex2 {
	 
	 public static void  main(String[] args) {
		 //creating  Map using TreeMap
		 Map<String, Integer> values=new TreeMap<>();
		 
		 //Insertion elements to map
		 values.put("Second",2);
		 values.put("First", 1);
		 System.out.println("Map using TreeMap:"+values);
		 
		 
		 
		 //Replacing the values
		 values.replace("First",11);
		 values.replace("Second",22);
		 System.out.println("New Map:"+values);
		 
		 //Remove elements from the map
		 int removedValues=values.remove("First");
		 System.out.println("Removed value:"+removedValues);
		 
	 } 

}
