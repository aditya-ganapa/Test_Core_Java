package Nov20;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		LocalTime localTime2=LocalTime.NOON;
		System.out.println("noon time "+localTime2);
		LocalTime localTime3=LocalTime.MIDNIGHT;
		System.out.println("mid night "+localTime3);
		LocalTime localTime4=localTime3.plusMinutes(600);
		System.out.println(localTime4);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(localTime4.format(formatter));
	}

}
