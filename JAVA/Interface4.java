package com.ust2;

interface Polygon1 {
	void getArea();
	
	//default method
	default void getSides() {
		System.out.println("i can get sides of a polygon.");
		
	}

}


//implements the interface

class Rectangle1 implements Polygon1{
	public void getArea() {
		int length=6;
		int breadth=5;
		int area=length*breadth;
		System.out.println("The are  of the rectangle is "+area);
	}
	
	//over ride the get sides()
		public void getSides() {
			System.out.println("i have 4 sides.");
		}
}
	//implents the interface
	class Rectangle2 implements Polygon1{
		public void getArea() {
			int length = 6;
			int breadth = 5;
			int area =length*breadth;
			System.out.println("The area of the rectanglr is "+area);
			
		}
	
	}


//implements the interface
class Squr1 implements Polygon1{
	public void getArea() {
		int length=5;
		int area=length*length;
		System.out.println("The area of the square is"+area);
	}
}

class Interface4{
	public static void main(String[] args) {
		
		//create an object of Rectangle
		
		
		Rectangle2 r1 = new Rectangle2();
		r1.getArea();
		r1.getSides();
		
		//create an object of square
		Squr1 s1=new Squr1();
		s1.getArea();
		s1.getSides();		
}
}