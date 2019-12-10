package Collections_Intoduction_List;
import java.util.ArrayList;
import java.util.Scanner;
public class q3_Main {
	public static void main(String[] args) {
		System.out.println("Enter the number of players");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Player> playerList=new ArrayList<Player>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the player name");
			if(i==0)
				sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter the country name");
			String country=sc.nextLine();
			System.out.println("Enter the skill");
			playerList.add(new Player(name,country,sc.nextLine()));
		}
		PlayerBO players=new PlayerBO();
		players.displayAllPlayerDetails(playerList);
		sc.close();
	}
}