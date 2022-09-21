package com.ForEach;

import java.util.Optional;

public class Optional6 {
	public static void main(String[] args) {
		Optional<String>strOptional= Optional.of("OneTWOTHREE");
		Optional<String>srOptional1=strOptional.map(String::toLowerCase);
		srOptional1.ifPresent(System.out::println);
		
	}

}
