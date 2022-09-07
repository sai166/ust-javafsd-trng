package com.ust3;


import java.util.TreeSet;
import java.util.Iterator;
 class Treeset {

	 
	 public static void main(String[] arg)
	 {
		 TreeSet<Integer>numbers=new TreeSet<>();
		 numbers.add(2);
		 numbers.add(5);
		 numbers.add(6);
		 System.out.println("TreeSet:"+numbers);
		 
		 //calling iterator()method
		 
		 Iterator<Integer>iterate=numbers.iterator();
		 System.out.println("TreeSet using Iterator:");
		 
		 //Accessing elements
		 while(iterate.hasNext()) {
			 System.out.println(iterate.next());
			 
			 System.out.println(",");
		 }
		 
		 
	 }
}
