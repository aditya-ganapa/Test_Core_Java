package OOPS;
import java.util.Scanner;

public class q5_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select the Card\n1.Payback Card\n2.Membership Card");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Enter the Card Details:");
		sc.nextLine();
		String cardDetails=sc.nextLine();
		String ar[]=cardDetails.split("\\|");
		switch (choice) {
		case 1:
			System.out.println("Enter points in card");
			int pointsEarned=sc.nextInt();
			System.out.println("Enter Amount");
			double totalAmount=sc.nextDouble();
			q5_PaybackCard p=new q5_PaybackCard(ar[0],ar[1],ar[2],pointsEarned,totalAmount);
			System.out.println(p.getHolderName()+"'s Payback Card Details:");
			System.out.println("Card Number "+p.getCardNumber());
			System.out.println("Points Earned "+p.getPointsEarned());
			System.out.println("Total Amount "+p.getTotalAmount());
			break;
		case 2:
			System.out.println("Enter rating in card");
			int rating=sc.nextInt();
			q5_MembershipCard m=new q5_MembershipCard(ar[0],ar[1],ar[2],rating);
			System.out.println(m.getHolderName()+"'s Membership Card Details:");
			System.out.println("Card Number "+m.getCardNumber());
			System.out.println("Rating "+m.getRating());
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}
}