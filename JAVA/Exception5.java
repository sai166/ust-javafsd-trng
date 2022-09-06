package com.exg;

import java.io.*;

public class Exception5 {
	public static void main(String[] args) {
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
			while((line = br.readLine())!=null) {
				System.out.println("Line=>"+line);
			}
		}catch(IOException e) {
			System.out.println("IOEception in try block=>"+e.getMessage());
		}
	}

}
