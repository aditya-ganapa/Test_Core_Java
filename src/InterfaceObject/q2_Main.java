package InterfaceObject;
import java.util.Scanner;
public class q2_Main {
	static void display(Product p){
		System.out.println("Product Id is "+p.getId());
		System.out.println("Product Name is "+p.getProductName());
		System.out.println("Supplier Name is "+p.getSupplierName());
	}
	public static void main(String[] args) {
		Product p[]=new Product[2];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {
			System.out.println("Enter the product id");
			long id=sc.nextLong();
			System.out.println("Enter the product name");
			sc.nextLine();
			String productName=sc.nextLine();
			System.out.println("Enter the supplier name");
			p[i]=new Product(id,productName,sc.nextLine());
			display(p[i]);
		}
		if(p[0].equals(p[1]))
			System.out.println("The two products are the same");
		else
			System.out.println("The two products are different");
		sc.close();
	}
}