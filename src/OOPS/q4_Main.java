package OOPS;
import java.util.Scanner;

public class q4_Main {
	public static void main(String[] args) {
		String s[]=new String[2];
		q4_Delivery delivery=new q4_Delivery();
		System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
		Scanner sc=new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter the bowler name");
			sc.nextLine(); // Important Line
			s[0]=sc.nextLine();
			System.out.println("Enter the batsman name");
			s[1]=sc.nextLine();
			delivery.displayDeliveryDetails(s[0],s[1]);
			break;
		case 2:
			System.out.println("Enter the number of runs");
			delivery.displayDeliveryDetails(sc.nextLong());
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}
}