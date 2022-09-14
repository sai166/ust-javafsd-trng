package com.Exception;

import java.io.FileOutputStream;

public class File10 {

	
	
	public static void main(String[] args) {
		String data ="This is a line of text inside the file.";
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\ustjavafsdb210\\sai.txt");
			byte[]array=data.getBytes();
			///]write byte to the findX
			output.write(array);
			output.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
