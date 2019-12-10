package java_fundamentals;
import java.util.Scanner;

public class q10_Main {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of GenCs");
		n=sc.nextInt();
		long id[]=new long[n];
		String name[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter Employee Id");
			id[i]=sc.nextLong();
			System.out.println("Enter Name");
			name[i]=sc.next();
		}
		q10_Trainee t[]=new q10_Trainee[n];
		for(int i=0;i<n;i++){
			t[i]=new q10_Trainee(id[i],name[i]);
			t[i].display();
		}
		sc.close();
	}
}