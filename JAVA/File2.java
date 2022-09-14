package com.Exception;

import java.io.FileReader;

public class File2 {
	
	public static void main(String[] args) {
		
		char[] array =new char[100];
		try {
			//creates a reader using the file reader
			FileReader input =new FileReader("text1.txt");
			
			//read  character
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			
			//close the reader
			
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
