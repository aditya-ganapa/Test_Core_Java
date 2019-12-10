package java_fundamentals;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		int x,y,z;
		float cp,profit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		x=sc.nextInt();
		System.out.println("Enter the price per dozen");
		y=sc.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		z=sc.nextInt();
		cp=(float)y/12;
		profit=((z-cp)/cp)*100;
		System.out.printf("Sam's profit percentage is ");
		System.out.printf("%.2f",profit);
		System.out.printf(" percent");
		sc.close();
	}
}
