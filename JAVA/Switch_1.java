package com.ust;
//java program to check size
//using the switch....case statement
public class Switch_1 {
	public static void main(String args[]) {
		int number=44;
		String size;
		//switch statement to check the size
		switch (number) {
			
			case 29:
			size="Medium";
			break;
			//match the value of week
			case 44:
				size="Large";
				break;
				
			case 48:
				size="Extra Large";
				break;
				default:
					size="Unknown";
				
		}
		System.out.println("size:"+ size);
	}

}
