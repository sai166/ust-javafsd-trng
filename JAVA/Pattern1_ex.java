package com.ust2;

 class Pattern1_exg {

	// method without parameter
	
	public void display() {
		for(int i =0;i<10;i++) {
			System.out.println("*");
		}
	}
	//method with single parameter
	public void display(char symbol) {
		for(int i =0;i<10;i++) {
		System.out.println(symbol);
	}
}
 }


class Pattern1_ex{
	public static void main(String[] args) {
		Pattern1_exg d1= new Pattern1_exg();
		
		//call method without arguments
		d1.display();
		System.out.println("\n");
		
		
		//call method with asingle arguments
		d1.display('#');
	}
	
}