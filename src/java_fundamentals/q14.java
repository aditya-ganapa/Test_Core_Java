package java_fundamentals;
import java.util.Scanner;

public class q14 {
	public static void main(String[] args){
		int n,total=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int tents[]=new int[n];
		for(int i=0;i<n;i++){
			tents[i]=sc.nextInt();
			total+=tents[i];
		}
		System.out.println(total);
		sc.close();
	}
}