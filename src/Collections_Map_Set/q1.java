package Collections_Map_Set;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class q1 {
	public static void main(String[] args) {
		System.out.println("Enter the number of players");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<String, Long> playerMap=new HashMap<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of the player "+(i+1));
			sc.nextLine();
			playerMap.put(sc.nextLine(), sc.nextLong());
		}
	//	Set<String> keys=new HashSet<String>();
	//	keys=playerMap.keySet();
		Set<String> keys=playerMap.keySet();
		long max=0;
		String player="";
		for (String string : keys) {
			if(playerMap.get(string)>max){
				player=string;
				max=playerMap.get(string);
			}
		}
		System.out.println(player);
		sc.close();
	}
}