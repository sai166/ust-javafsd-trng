package com.ust2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
	
	public static void main(String[] args) {
		
		Set<Integer> s= new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		for(int i:s)
			System.out.println(i);
		
		Iterator itr =s.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		
		
	}

}
