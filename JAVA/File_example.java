package com.Exception;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\ustjavafsdb210\\text1");
		
		try
		{
			FileOutputStream fstm=new FileOutputStream(f);
			byte[] b="This i am writing a file.".getBytes();
			if(f.createNewFile()) {
			
				System.out.println("New file created");
		}
		else {
			System.out.println("File exist");
		}
	}
	catch(IOException e) {
		
		e.printStackTrace();
	}

	}
	}
