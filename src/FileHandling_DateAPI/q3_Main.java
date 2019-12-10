package FileHandling_DateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class UserMainCode {
	static void displayDate(String dateString) throws ParseException {
    //	Date date=new Date(dateString);
		Date date=new SimpleDateFormat("MMMMM dd,yyyy").parse(dateString);
	//	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	//	System.out.println(dateFormat.format(date));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
	}
}

public class q3_Main {
	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		String dateString=scanner.nextLine();
		UserMainCode.displayDate(dateString);
		scanner.close();
	}
}