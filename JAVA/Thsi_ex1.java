package com.ust;

public class Thsi_ex1 
{
	static int X=1;
	private int Y=3;
	public void method1(int X)
	{
		Thsi_ex1 t= new Thsi_ex1();
		this.X=2;
		Y =4;
		System.out.println("Test.x:"+Thsi_ex1.X);
		System.out.println("t.x:"+t.X);
		System.out.println("t.y:"+t.Y);
		System.out.println("y:"+Y);
	}
	public static void main(String args[])
	{
		Thsi_ex1 t =new Thsi_ex1();
		t.method1(5);
	}

			
	}
	
	


