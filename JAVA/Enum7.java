package Thread;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;               

public class Enum7 {
	public static void main(String[] args) {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("DD/MM/YYY");
		String date="14/10/2022";
		LocalDate localDate=LocalDate.parse(date,formatter);
		System.out.println("parsed local date:"+localDate);
		System.out.println("formatted local date:"+formatter.format(localDate));
	}

}
