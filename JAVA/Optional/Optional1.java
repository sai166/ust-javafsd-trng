package com.ForEach;

import java.util.Optional;

public class Optional1 {
	public static void main(String[] args) {
		Optional<String>str = Optional.of("One");
		//Optional conatains String value
		System.out.println(str.orElse("defaultvalue"));//output one
		Optional<String>str1=Optional.empty();
		//Empty Optional object
		
		System.out.println(str1.orElse("defaultvalue"));
		//default value is returned
		
	} 

}
