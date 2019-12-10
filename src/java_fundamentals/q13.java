package java_fundamentals;
import java.util.Scanner;

public class q13 {
	public static void main(String[] args){
		int n;
		String days[]={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number");
		n=sc.nextInt();
		System.out.println("Day of the week is "+days[n-1]);
		sc.close();
	}
}