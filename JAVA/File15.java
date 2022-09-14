package com.Exception;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class File15 {
	public static void main(String[] args) {
		String data ="This is a line of text inside the file by sai ";
		try {
			//create  a FileOutputStream
			FileOutputStream file = new FileOutputStream("C:\\Users\\ustjavafsdb210\\sai.txt");
			
			//creates a BufferedOutputStream
			BufferedOutputStream output = new BufferedOutputStream(file);
			
			byte[]array= data.getBytes();
			
			//write data to the output stream
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
