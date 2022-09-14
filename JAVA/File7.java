package com.Exception;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class File7 {
	
	public static void main(String[] args) {
		String data ="Thsis is aline of text inside the file.";
		try {
			OutputStream out = new FileOutputStream("text1.txt");
			
			//convert the string into bytes
			byte[]dataBytes=data.getBytes();
			
			//Written data tot the output stream
			out.write(dataBytes);
			System.out.println("Data is written to the file.");
			
			//close the output stream
			out.close();
		}
		catch (Exception e) {
			e.getStackTrace();
			
		}
		
		
	}

}
