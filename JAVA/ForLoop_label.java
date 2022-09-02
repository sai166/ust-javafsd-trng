package com.ust;

public class ForLoop_label {
	public static void main(String array[]) {
		//for loop
		first:
			for(int i=1;i<5;i++) {
				//the for loop is labeled as second
				Second:
					for(int j=1;j<3;j++) {
						System.out.println("i="+i+";j="+j);
						if(i==2)
							break first;
					}

			}
	}

}
