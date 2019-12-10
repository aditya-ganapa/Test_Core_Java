package Nov11;

import java.util.Date;

import java.text.SimpleDateFormat;

public class DateDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormat.format(date));
		dateFormat=new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(dateFormat.format(date));

		dateFormat=new SimpleDateFormat("E dd/MMMM/yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("E dd/MMMM/yyyy G");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("E dd/MMMM/yyyy G hh:mm:ss");
		System.out.println(dateFormat.format(date));
	}
}