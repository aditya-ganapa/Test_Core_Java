package java_fundamentals;
import java.util.Scanner;

public class q7 {
	public float calculateProfit(int dozenCount, int pricePerDozen,  int sellPrice){
		float cp;
		cp=(float)pricePerDozen/12;
		return ((sellPrice-cp)/cp)*100;
	}
	public static void main(String[] args) {
		int x,y,z;
		float profit;
		Scanner sc=new Scanner(System.in);
		q7 q=new q7();
		System.out.println("Enter the number of dozens of toys purchased");
		x=sc.nextInt();
		System.out.println("Enter the price per dozen");
		y=sc.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		z=sc.nextInt();
        profit=q.calculateProfit(x,y,z);
		System.out.printf("Sam's profit percentage is ");
		System.out.printf("%.2f",profit);
		System.out.printf(" percent");
		sc.close();
	}
}
