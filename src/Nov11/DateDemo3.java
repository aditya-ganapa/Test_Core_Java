package Nov11;

import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1=new Date(2018,9,6);
		Date date2=new Date(2018,9,5);
		if(date1.compareTo(date2)>0)
			System.out.println("First date is after second date");
		System.out.println(date1.compareTo(date2));
	}

}
