package OOPS;
import java.util.Scanner;

public class q1_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String accountNumber=sc.next();
		System.out.println("Enter the Account Balance");
		int balance=sc.nextInt();
		q1_Account account=new q1_Account(accountNumber,balance);
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
		int type=sc.nextInt();
		if(type==1){
			System.out.println("Enter the amount to deposit");
			account.deposit(sc.nextInt());
		}
		else{
			System.out.println("Enter the amount to withdraw");
			account.withdraw(sc.nextInt());
		}
		System.out.println("Your balance after the transaction is:"+account.getBalance());
		sc.close();
	}
}