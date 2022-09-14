package com.Exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class File11 {
	public static void main(String[] args) {
		
		//create an array of character
		
		char[]array = new char[100];
		try {
			//create a file reader
			FileReader file = new FileReader("C:\\Users\\ustjavafsdb210\\text1.txt");
			
			
			//create a bufferedReader
			BufferedReader input = new BufferedReader(file);
			
			//Reads character
			
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
