package com.ust;

public class Case_eg1 {
	//Java program to demonstarte switch case
    //with multiple case without break statement
	public static void main(String args[]) {
		int day = 2;
		String dayType;
		String dayString;
		switch(day) {
		case 1:
		dayString="Monday";
		break;
		case 2:
		dayString="Tuesday";
		break;
		case 3:
		dayString="wednesday";
		break;
		case 4:
		dayString="thursday";
		break;
		case 5:
	    dayString="friday";
	    break;
		case 6:
		dayString="saturday";
		break;
		case 7:
		dayString="sunday";
		break;
		default:
		dayString="invalid data";
		}
		switch(day) {
		//multiple cases without break statemenets 
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		dayType="weekday";
		break;
		case 6:
		case 7:
		dayType="weekend";
		break;
		default:
			dayType="Invalid datatype";
		
			
		}
		System.out.println(dayString+"/t is a" + dayType);
	}
}
	


