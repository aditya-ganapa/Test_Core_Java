package Java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class q2 {

	public static void main(String[] args) {
		System.out.print("Enter age:");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		Predicate<Integer> predicate = a -> (a >= 18);
		if(predicate.test(age))
			System.out.println("Eligible to vote.");
		else
			System.out.println("Ineligible to vote.");
		scanner.close();
	}
}