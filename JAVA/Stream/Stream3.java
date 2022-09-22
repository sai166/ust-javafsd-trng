package Stream;

import java.util.function.Predicate;



public class Stream3{
	public static void main(String[] args) {
		Predicate<Integer>checkOddEven=x->x%2==0;
		
		System.out.println("Number 14 is Even:"+checkOddEven.test(14));
		System.out.println("Number 17 is ODD:"+checkOddEven.test(18));
		System.out.println("Number 21 is Even:"+checkOddEven.test(21));
		
	}
		


	}

