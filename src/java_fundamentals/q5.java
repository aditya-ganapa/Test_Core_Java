package java_fundamentals;
import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		int x,y,z,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		x=sc.nextInt();
		System.out.println("Enter y");
		y=sc.nextInt();
		System.out.println("Enter z");
		z=sc.nextInt();
        min=x<y?(x<z?x:z):y;
        if(x==min)
        	System.out.printf("L1 has the minimal seating capacity");
        else if(y==min)
        	System.out.printf("L2 has the minimal seating capacity");
        else
        	System.out.printf("L3 has the minimal seating capacity");
        sc.close();
	}
}
