package com.ust2;

public class wrapper {
	public static void main(String[] args) {
		//create primitive type
		int a=5;
		double b=5.65;
		
		//converts into wrapper objects
		Integer aObj =Integer.valueOf(a);
		Double bObj = Double.valueOf(b);
		
		
		if(aObj instanceof Integer) {
			System.out.println("An object of integer is created.");
			
		}
		if(bObj instanceof Double) {
			System.out.println("An object of double is created.");
		}
	}

}
