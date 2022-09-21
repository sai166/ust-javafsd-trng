
package com.ForEach;

import java.util.Optional;

public class Optional5 {
	public static void main(String[] args) {
		
		Optional<String>emptyOption=Optional.empty();
		Optional<String>strOption=Optional.of("One");
		
		System.out.println(emptyOption.orElseGet(()->"optional null orElseGet"));
		System.out.println(strOption.orElseGet(()->"Optional value orElseGet"));
	}

}
