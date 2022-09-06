package com.exg;

public class String8 {
	public static void main(String[] args) {
		String str1="Learn java";
		String str2="java";
		String str3="java";
		Boolean result;
		//true because "Learn java"contains "java"
		if(str1.contains(str2)) {
			System.out.println(str1+"contains"+str2);
		}
		else {
			System.out.println(str1+"doesnt contains"+str2);
		}
		
		//contains() is case-senstive
		//false because "Learn java"
		if(str1.contains(str3)) {
			System.out.println(str1+"contains"+str3);
		}
		else {
			System.out.println(str1+"doesnt conain"+str3);
		}
	}

}
