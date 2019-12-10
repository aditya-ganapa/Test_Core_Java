package Nov11;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class DateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL);
		String s=dateFormat.format(date);
		System.out.println("Full Format:"+s);
		
		dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Medium Format:"+dateFormat.format(date));
		
		dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.FRENCH);
		System.out.println("Medium Format for France:"+dateFormat.format(date));
		
		dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.KOREAN);
		System.out.println("Medium Format for Korea:"+dateFormat.format(date));
		
		dateFormat=DateFormat.getDateInstance(DateFormat.SHORT,Locale.JAPAN);
		System.out.println("Short Format for France:"+dateFormat.format(date));
		
		dateFormat=DateFormat.getDateInstance(DateFormat.SHORT,Locale.CHINESE);
		System.out.println("Short Format for China:"+dateFormat.format(date));
	}
}