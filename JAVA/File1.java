package com.Exception;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		// create a file object
		
		File file=new File("file.txt");
		// deletes the file
		
		boolean value=file.delete();
		if(value) {
			System.out.println("The File is deleted.");
		}
		else {
			System.out.println("The File is not deleted.");
		}
	}
}
