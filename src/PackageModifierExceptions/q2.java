package PackageModifierExceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvalidAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public InvalidAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public InvalidAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public InvalidAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}

public class q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		try{
			if(sc.nextInt()<19){
				sc.close();
				throw new InvalidAgeException("InvalidAgeException: not valid");
			}
			else
				System.out.println("welcome to vote");
		}
		catch (InvalidAgeException e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
		sc.close();
	}
}