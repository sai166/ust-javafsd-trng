package com.ust;

public class For_ex2 {
	//program to find the sum of natural numbers from 1 to 1000
	public static void main(String args[]) {
		int sum=0;
		int n=5;
		//for loop
		for(int i=1;i<=n;++i) {
			//body inside for loop
			sum+=i;//sum=sum+i
		}
		System.out.println("sum="+sum);
	}

}
