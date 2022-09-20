package com.MethodReference;

public class Method2 {
	public static void ThreadStatus() {
	System.out.println("thread is running...");
	}
	
	public static void main(String[] args) {
		Thread t2=new Thread(Method2::ThreadStatus);
		
		t2.start();
	}

}
