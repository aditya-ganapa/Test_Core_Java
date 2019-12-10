package FileHandling_DateAPI;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
public class t {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
		System.out.println("Date is: " + formatter.format(date));
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
    }
}