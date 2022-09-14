package com.Exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class File14 {
	public static void main(String[] args) {
		try {
			//creates a FileInputStream
			
			FileInputStream file = new FileInputStream("text1.txt");
			
			//creates a bufferdinputStream
			
			BufferedInputStream input = new BufferedInputStream(file);
			
			//Read first byte from the file
			int i = input.read();
			while(i!=-1) {
				System.out.println((char)i);
				
				//Read next byte from the file
				i=input.read();
				
			}
			input.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
