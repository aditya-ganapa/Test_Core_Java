package InterfaceObject;
import java.util.Scanner;
public class q3_Main {
	public static void main(String[] args) {
		System.out.println("Enter the product id");
		Scanner sc=new Scanner(System.in);
		long id=sc.nextLong();
		System.out.println("Enter the product name");
		sc.nextLine();
		String productName=sc.nextLine();
		System.out.println("Enter the supplier name");
		Product p=new Product(id,productName,sc.nextLine());
		System.out.println(p.toString());
		System.out.println("Invoking getClass() method:class "+p.getClass().getSimpleName());
		sc.close();
	}
}