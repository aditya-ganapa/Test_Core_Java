package FileHandling_DateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class q4_UserMainCode {
	static void displayDate(String dateString) throws ParseException {
    //	Date date=new Date(dateString);
	//	Date date=new SimpleDateFormat("MMMMM dd,yyyy").parse(dateString);
	//	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	//	System.out.println(dateFormat.format(date));
	//	System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
		Date date=new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
	//	Calendar calendar=Calendar.getInstance();
	//	calendar.set(1900+date.getYear(),1+date.getMonth(),27+date.getDay());
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		System.out.print("20 months before "+calendar.get(Calendar.YEAR)+"-"+(1+calendar.get(Calendar.MONTH))+"-"+calendar.get(Calendar.DATE)+" will be ");
		calendar.add(Calendar.MONTH, -20);
		System.out.println(calendar.get(Calendar.YEAR)+"-"+(1+calendar.get(Calendar.MONTH))+"-"+calendar.get(Calendar.DATE));
	}
}

public class q4_Main {
	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		String dateString=scanner.nextLine();
		q4_UserMainCode.displayDate(dateString);
		scanner.close();
	}
}