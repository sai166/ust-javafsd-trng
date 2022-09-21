package com.ForEach;
import java.util.Optional;

public class Optional4 {
	public static void main(String[] args) {
		
		
		//creating non null  optional object
		Optional<String> optional1 = Optional.of("hello");
		//checking value present in the optional or not
		
		if(optional1.isPresent()) {
			String value = optional1.get();
			System.out.println("Optional value:"+value);
			
			
		}
		else {
			//if optional has no value
			System.out.println("Optional has no value");
		}
	}

}
