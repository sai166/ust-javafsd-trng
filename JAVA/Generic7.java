package com.ust3;



class GenericsType4<T>{
	
	//java generic method
	public static<T>boolean isEqual(GenericsType4<T>g1,GenericsType4<T>g2){
		
	return g1.get().equals(g2.get());
	}
	
	T Obj;
	
	public T get() {
		return this.Obj;
	}
	
	public void set(T Obj) {
		this.Obj=Obj;
		
	}
	
}
public class Generic7 {
	
	//java generic method
	
	

	
	public static<T>boolean isEqual(GenericsType4<T>g1,GenericsType4<T>g2) {
		return g1.get().equals(g2.get());
	}
	
	public static void main(String args []) {
		GenericsType4<String>g1=new GenericsType4<>();
		g1.set("Pankaj");
		
		
		GenericsType4<String>g2=new GenericsType4<>();
		g2.set("Pankaj");
		
		
		
		
boolean isEqual = Generic7.<String>isEqual(g1,g2);



//above statements can be written simply as


System.out.println(isEqual);
isEqual = Generic7.isEqual(g1,g2);
	}

}
