package java_fundamentals;

import java.util.Scanner;

public class q9_ProductMain {
	public static void main(String[] args) {
		long Id;
		String ProductName,SupplierName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id");
		Id=sc.nextLong();
		System.out.println("Enter the product name");
		ProductName=sc.next();
		System.out.println("Enter the supplier name");
		SupplierName=sc.next();
		q9_Product p=new q9_Product(Id,ProductName,SupplierName);
		p.display();
		sc.close();
	}
}