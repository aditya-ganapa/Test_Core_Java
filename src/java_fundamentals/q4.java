package java_fundamentals;
import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		float item1,item2,total,sa,da;
		int discount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Price of item 1:");
		item1=sc.nextFloat();
		System.out.println("Price of item 2:");
		item2=sc.nextFloat();
		System.out.println("Discount in percentage:");
		discount=sc.nextInt();
		total=item1+item2;
		sa=total*discount/100;
		da=total-sa;
		System.out.printf("Total amount:$");
		System.out.printf("%.2f",total);
		System.out.printf("\nDiscounted amount:$");
		System.out.printf("%.2f",da);
		System.out.printf("\nSaved amount:$");
		System.out.printf("%.2f",sa);
		sc.close();
	}
}
