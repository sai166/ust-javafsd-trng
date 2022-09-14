package com.Exception;

import java.io.File;

public class File8 {
	public static void main(String[] args) {
		
		//create a file object
		File file=new File("C:\\Users\\ustjavafsdb210");
		
		//return an array of all files
		String[] fileList=file.list();
		
		for(String str : fileList){
			System.out.println(str);
		}
	}

}
