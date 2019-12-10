package OOPS;
import java.util.Scanner;

public class q3_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Rectangle\n2.Square\n3.Circle\n4.Hexagon\nArea Calculator---Choose your shape");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter length and breadth:");
			q3_Rectangle r=new q3_Rectangle(sc.nextInt(),sc.nextInt());
			System.out.printf("Area of "+r.shapeName+" is:");
			System.out.printf("%.2f",r.calculateArea());
			break;
		case 2:
			System.out.println("Enter side:");
			q3_Square s=new q3_Square(sc.nextInt());
			System.out.printf("Area of "+s.shapeName+" is:");
			System.out.printf("%.2f",s.calculateArea());
			break;
		case 3:
			System.out.println("Enter Radius:");
			q3_Circle c=new q3_Circle(sc.nextInt());
			System.out.printf("Area of "+c.shapeName+" is:");
			System.out.printf("%.2f",c.calculateArea());
			break;
		case 4:
			System.out.println("Enter Side:");
			q3_Hexagon h=new q3_Hexagon(sc.nextInt());
			System.out.printf("Area of "+h.shapeName+" is:");
			System.out.printf("%.2f",h.calculateArea());
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}
}