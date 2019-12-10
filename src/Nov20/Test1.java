package Nov20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2019, 11, 20);
		System.out.println(date2);
		date2.plusDays(55);
		System.out.println(date2);
		LocalDate date3 = date2.plusDays(55);
		System.out.println(date3);
		LocalDate date4 = LocalDate.now();
		System.out.println(date4);
		System.out.println(date4.plusYears(5));
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s = date4.format(formatter);
		System.out.println(s);
		
	}

}
