package com.Exception;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File13 {
	public static void main(String[] args) {
		String data="This is the data in the output file";
		
		try {
			
			//create a File writer
			FileWriter file=new FileWriter("C:\\Users\\ustjavafsdb210\\text.txt");
			//creates a BufferWriter
			BufferedWriter output =new BufferedWriter(file);
			
			//write the string to tthe file
			output.write(data);
			
			//close the writer
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
