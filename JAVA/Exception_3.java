package com.exg;
import java.io.*;
public class Exception_3 {
//declare the type of exception
public static void findFile()throws IOException{
	//code that man generates IOException 
	File newfile=new File("test.txt");
	FileInputStream stream = new FileInputStream(newfile);
	
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
