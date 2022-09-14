package com.Exception;

import java.io.FileInputStream;

public class File17 {
	public static void main(String[] arg) {
		try {
			FileInputStream input = new FileInputStream("text1.txt");
			System.out.println("Data in the file:");
			
			
			//reads the foirst byte
			
			int i =input.read();
			
			while(i!=-1) {
				System.out.println((char)i);
				
				
				//Reads next byte from the file
				i=input.read();
			}
			input.close();
		}
				
			
			catch(Exception e) {
				e.getStackTrace();
			}
			
	}
	
	
	

}
