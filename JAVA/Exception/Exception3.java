package com.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception3 {

	public static void findFile() throws IOException {
		// TODO Auto-generated method stub
		//code that generates IOException
		File newFile=new File("C:\\Users\\ustjavafsdb210\\text.txt");
		FileInputStream stream = new FileInputStream(newFile);

	}
	
	public static void main(String[] args) {
		try {
			findFile();
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	

}
