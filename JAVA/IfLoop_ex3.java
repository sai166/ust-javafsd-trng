package com.ust;

public class IfLoop_ex3 {
	public static void main(String args[]) {
		//Declaration double type variable
		double n1=-1.0,n2=4.5,n3=-5.3, largest;

		//checks if n1 is greater than or equal to n2
		if(n1>=2) {
			//if..else statement inside the if block
			//checks if n1 is greater than or equal to n3
			if(n1>=n3) {
				largest= n1;
			}
			else {
				largest=n3;
			}
		}else {
			
			//if.else statements inside else block
			//checks if n1 is greater than or equal to n3
			if(n2>=n3) {
				largest=n2;
			}
			else {
				largest=n3;
			}
		}
		
		System.out.println("Largest Number:"+largest);
		
	}

}
