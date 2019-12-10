package Collections_Intoduction_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> scores=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			scores.add(sc.nextInt());
		}
		scores.sort(null);
		for (Integer integer : scores) {
			System.out.println(integer);
		}
		sc.close();
	}
}