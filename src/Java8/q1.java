package Java8;

import java.util.Scanner;

interface MathExpression {
	double tempConv(double a);
}

public class q1 {
	public static double toCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
	
	public static double toCelsiusLambda(double fahrenheit) {
		MathExpression expression = a -> (a - 32) * 5 / 9;
		return expression.tempConv(fahrenheit);
	}

	public static void main(String[] args) {
		System.out.print("Enter the temperature in fahrenheit:");
		Scanner scanner = new Scanner(System.in);
		double fahrenheit = scanner.nextDouble();
		System.out.println("Temperature in celsius calculated using arithmetic expression:"+toCelsius(fahrenheit));
		System.out.println("Temperature in celsius calculated using lambda expression:"+toCelsiusLambda(fahrenheit));
		scanner.close();
	}
}