package com.Exception;

import java.io.FileInputStream;
import java.io.InputStream;

public class File6 {
	
	public static void main(String[] args) {
		byte[] array= new  byte[100];
		try {
			InputStream input =  new FileInputStream("text1.txt");
			System.out.println("Available bytes in the file:"+input.available());
			
			//read byte from the input stream
			input.read(array);
			System.out.println("Data read from the file:");
			
			//convert byte array into string
			
			String data =  new String(array);
			System.out.println(data);
			
			
			//close the input stream
			input.close();
		}
		catch (Exception e) {
			e.getStackTrace();
			
		
		
			
		}
	}
}
