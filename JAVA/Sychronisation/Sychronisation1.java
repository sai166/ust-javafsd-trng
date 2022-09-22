package com.ForEach;

public class Sychronisation1 extends Thread {
	public static void main(String[] args) {
		Sychronisation1 t1= new Sychronisation1();
		t1.start();
		Sychronisation1 t2 = new Sychronisation1();
		t2.start();
		
	}
	public void run() {
		
		synchronized(this){
			System.out.println("in synchronized ");
			
		}
		System.out.println("Thread is started");
		System.gc();
		
	}

}
