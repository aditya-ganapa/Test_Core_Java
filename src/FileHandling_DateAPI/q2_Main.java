package FileHandling_DateAPI;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q2_Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the name of the player");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.println("Enter the team name");
		String teamName=scanner.nextLine();
		System.out.println("Enter the number of matches played");
		int noOfMatches=scanner.nextInt();
		FileWriter fileWriter=new FileWriter("c:/hello/player.csv");
		fileWriter.write(name+","+teamName+","+noOfMatches);
		fileWriter.close();
		scanner.close();
	}
}