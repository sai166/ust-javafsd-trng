package com.ust2;

 interface  Polygon{
	 void getArea(int length,int breadth);

}
 //implementing the polygon interface
 class Rectangle implements Polygon{
	  
	 //implementation of abstract method
	 public void getArea(int length, int breadth) {
		 System.out.println("The area of the rectangle is"+(length*breadth));
	 }
 }
class Interface1{
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		r1.getArea(8,5
				);
	}
}