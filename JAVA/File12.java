package com.Exception;

import java.io.FileOutputStream;

public class File12 {
	public static void main(String[] args) {
		String data ="This is a line of text inside the file.";
		try {
			FileOutputStream output = new FileOutputStream("text1.txt");
			
			byte[]array=data.getBytes();
			
			//write byte to the file
			output.write(array);
			
			output.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
