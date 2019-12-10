package Nov11;
import java.util.Calendar;
public class CalendarDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calender=Calendar.getInstance();
		System.out.println(calender);
		System.out.println(calender.get(Calendar.HOUR)+":"+calender.get(Calendar.MINUTE)+":"+calender.get(Calendar.SECOND));
		System.out.println(calender.get(Calendar.DATE)+"/"+calender.get(Calendar.MONTH)+"/"+calender.get(Calendar.YEAR));
		calender.add(Calendar.HOUR, 5);
		calender.add(Calendar.MONTH, -20);
		calender.add(Calendar.YEAR, 7);
		System.out.println(calender.get(Calendar.DATE)+"/"+calender.get(Calendar.MONTH)+"/"+calender.get(Calendar.YEAR));
	}
}