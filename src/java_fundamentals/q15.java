package java_fundamentals;
import java.util.Scanner;

public class q15 {
	public static void main(String[] args){
		int n,total=0,i=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int tents[]=new int[n];
		while(i<n){
			tents[i]=sc.nextInt();
			total+=tents[i];
			i++;
		}
		System.out.println(total);
		sc.close();
	}
}