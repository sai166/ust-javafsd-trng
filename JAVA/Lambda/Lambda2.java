package com.Lambda;


//it is optional
interface Drawable{
	public void draw();
}
public class Lambda2 {
	public static void main(String[] args) {
		int width=10;
		Drawable d2=()->{
			System.out.println("Drawing"+width);
		};
		d2.draw();
	}

}
