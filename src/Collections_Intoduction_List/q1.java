package Collections_Intoduction_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> scores=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) 
			scores.add(sc.nextInt());
		int totalPoints=0;
		for (Integer integer : scores) 
			totalPoints+=integer;
		System.out.println(totalPoints);
		int totalPoints1=0;
		for (int i = 0; i < scores.size(); i++)
			totalPoints1+=scores.get(i);
		System.out.printf("%.2f",(float)totalPoints1/n);
		sc.close();
	}

}
