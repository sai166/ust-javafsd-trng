package com.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class Method1 {
	public static void main(String[] args) {
		List names = new ArrayList();
		
		names.add("Mahes");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		names.forEach(System.out::println);
		
		
		
		
	}

}
