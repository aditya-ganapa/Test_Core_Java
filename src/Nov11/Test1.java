package Nov11;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		Date date1=new Date(1);
		System.out.println(date1);
		System.out.println("Date is "+date.getDate()+"/"+date.getMonth()+"/"+date.getYear());
		System.out.println("Date is "+date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900));
		System.out.println("Time is "+date.getHours()+":"+(date.getMinutes())+":"+(date.getSeconds()));
		if(date.after(date1))
			System.out.println(date+" is after "+date1);
		System.out.println(date.compareTo(date1));
		//date.before(when)
		//date.equals()
	}
}