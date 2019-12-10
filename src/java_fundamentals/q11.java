package java_fundamentals;
import java.util.Scanner;

public class q11 {

	public static void main(String[] args){
		String s,ss;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.next();
		System.out.println("Enter the start string");
		ss=sc.next();
		if(s.startsWith(ss))
			System.out.println("\""+s+"\""+" starts with \"https\"");
		else
			System.out.println("\""+s+"\""+" does not start with \"https\"");
		sc.close();
	}
}