package com.ust2;

public class Generic1<T> {

	T t;
	public T get() {
		return  t;
	}
	
	
	public void set(T t) {
		this.t=t;
		
	}
	
	
	public static void main(String[] arg) {
		
		
		Generic1<String> g=new Generic1<>();
		g.set("SAI");
		
		System.out.println(g.get());
		
		
		Generic1<Integer> gi =new Generic1<>();
		gi.set(100);
		System.out.println(gi.get());
	}
}
