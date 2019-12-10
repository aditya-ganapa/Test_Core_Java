package Nov20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate date2=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(date2);
		LocalDate date3=date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(date3);
		System.out.println(date3.format(DateTimeFormatter.ofPattern("EEEE")));
	}

}
