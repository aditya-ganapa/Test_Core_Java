package java_fundamentals;
import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
        if(x<y)
        	System.out.printf(x+" is less than "+y);
        else if(x>y)
        	System.out.printf(x+" is greater than "+y);
        else
        	System.out.printf(x+" is equal to "+y);
        sc.close();
	}
}
