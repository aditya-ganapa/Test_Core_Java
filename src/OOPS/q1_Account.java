package OOPS;

public class q1_Account {
	private String accountNumber;
	private int balance;
	
	q1_Account(String accountNumber,int balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int transactionAmount) {
		balance+=transactionAmount;
	}
	
	public void withdraw(int transactionAmount) {
		if(balance-transactionAmount<0)
			System.out.println("Insufficient Balance");
		else
			balance-=transactionAmount;
	}
}