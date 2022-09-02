package com.ust;

public class Double {
	public static void main(String[]args) {
		int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		double average;
		
		//access all element using for each loop
		//add each element in sum
		for (int number: numbers) {
			sum +=number;
		}
			//get the total number of elements
			int arrayLength= numbers.length;
			average = ((double)sum /(double)arrayLength);
			System.out.println("Sum="+sum);
			System.out.println("Average="+average);
			
			
		}
	}
