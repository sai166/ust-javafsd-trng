package com.ust3;


import java.util.TreeMap;
class Map4{

public static void main(String[] args) {
	//creating TreeMap of even numbers
	TreeMap<String,Integer>evenNumbers=new TreeMap<>();
	//using put()
	evenNumbers.put("Two",2);
	evenNumbers.put("Four",4);
	
	//using putifAbsent()
	evenNumbers.putIfAbsent("six",6);
    System.out.println("TreeMap of even numbers:"+evenNumbers);
    
    
    //creating TreeMap of numbers
    
    TreeMap<String,Integer>numbers=new TreeMap<>();
    numbers.put("One",1);
    
    //using putAll()
    numbers.putAll(evenNumbers);
    System.out.println("TreeMap of numbers:"+numbers);
	
	
	
	
}


}
