package com.ust3;


import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	
	public static void main(String[] args) {
		//creating an arrayList
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		
		System.out.println("ArrayList:"+numbers);
		
		//creating an instance of iterator
		Iterator<Integer> iterate=numbers.iterator();
		
		//using the next()method
		int number= iterate.next();
		System.out.println("Accessed Element:"+ number);
		
		//using thye removed()method
		iterate.remove();
		System.out.println("Removed Elements:"+ numbers);
		
		System.out.println("Updated ArrayList:");
		
		
		//using the hasnext()method
		
		while(iterate.hasNext()) {
			
			//using the foreachRemaning()method
			iterate.forEachRemaining((value)->System.out.println(value+","));
			
		}
		
	}
}





