package Nov11;
import java.util.Date;
//import java.sql.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		long l1=date.getTime();
		System.out.println("Number of milliseconds after 1970 jan 1 "+l1);

	}

}
