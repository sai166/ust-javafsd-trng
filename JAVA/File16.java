package com.Exception;

import java.io.File;

public class File16 {
	
	public static void main(String[] args) {
		//create a file object for the current location
		
		File file =new File("text1.txt");
		
		try {
			//trying to create a file based on the object
			
			boolean value =file.createNewFile();
			if(value) {
				
				System.out.println("The new file is created.");
			}
			else {
				System.out.println("The file already exixts.");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		
		}
	}

}
