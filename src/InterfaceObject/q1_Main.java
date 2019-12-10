package InterfaceObject;
import java.util.Scanner;
public class q1_Main {
	public static void main(String[] args) {
		System.out.println("Menu\n1.Cricket Player Details\n2.Hockey Player Details\nEnter choice");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Enter player name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter team name");
		String teamName=sc.nextLine();
		System.out.println("Enter number of matches played");
		int noOfMatches=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter total runs scored");
			int totalRunsScored=sc.nextInt();
			System.out.println("Enter total number of wickets taken");
			CricketPlayer c=new CricketPlayer(name,teamName,noOfMatches,totalRunsScored,sc.nextInt());
			c.displayPlayerStatistics();
			break;
		case 2:
			System.out.println("Enter the position");
			sc.nextLine();
			String position=sc.nextLine();
			System.out.println("Enter total number of goals taken");
			HockeyPlayer h=new HockeyPlayer(name,teamName,noOfMatches,position,sc.nextInt());
			h.displayPlayerStatistics();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}
}