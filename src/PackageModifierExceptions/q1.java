package PackageModifierExceptions;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try{
			System.out.println("The quotient of "+a+"/"+b+"="+(a/b));
		}
		catch(ArithmeticException e){
			System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
		sc.close();
	}
}