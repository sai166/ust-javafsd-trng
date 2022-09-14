package com.Exception;


public class File5 {
	
	public double Calculate(int a,int b) throws Exception
	{
	//throw new  Exception("Con");
		return (a+b);
	}
	
	void display(int x)throws Exception
	{
		if (x==5) throw new Exception();
		
		else System.out.println("km");
		
	}
	
	
	public static void main(String[] args) {
		
		File5 e = new File5();
		
	try {
		e.Calculate(5, 4);
		
		e.display(5);
	}
	catch(Exception f) {
		f.printStackTrace();
	}
		
		
	}

}
