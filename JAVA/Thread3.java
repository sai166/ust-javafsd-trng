package com.Exception;

public class Thread3  extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t3=new Thread3();
		try {
			System.out.println("Hi");
			t3.sleep(5000000);
			System.out.println("sleep");
		
	
	}
	catch(Exception ex) {
		ex.getStackTrace();
		
	}
}
}

