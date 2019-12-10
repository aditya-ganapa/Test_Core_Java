package OOPS;
import java.util.Scanner;

public class q2_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Rectangle\n2.Square\n3.Circle\nArea Calculator---Choose your shape");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter length and breadth:");
			q2_Rectangle r=new q2_Rectangle(sc.nextInt(),sc.nextInt());
			System.out.printf("Area of "+r.shapeName+" is:");
			System.out.printf("%.2f",r.calculateArea());
			break;
		case 2:
			System.out.println("Enter side:");
			q2_Square s=new q2_Square(sc.nextInt());
			System.out.printf("Area of "+s.shapeName+" is:");
			System.out.printf("%.2f",s.calculateArea());
			break;
		case 3:
			System.out.println("Enter Radius:");
			q2_Circle c=new q2_Circle(sc.nextInt());
			System.out.printf("Area of "+c.shapeName+" is:");
			System.out.printf("%.2f",c.calculateArea());
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}
}