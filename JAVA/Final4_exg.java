package com.exg;

public class Final4_exg {
//create a final class
	final class Final_exg{
		public void display() {
			System.out.println("This is a final method");
			
		}
	}
	//try to extends the final class
	class Main extends Final4_exg{
	public void display() {
		System.out.println("The final method is overridden.");
		}
	public static void main(String[] args) {
		Main obj=new Main();
         obj.display();
	}
	}
}
