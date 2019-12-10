package java_fundamentals;

import java.util.Scanner;

public class q8_ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q8_Product p=new q8_Product();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id");
		p.setId(sc.nextLong());
		System.out.println("Enter the product name");
		p.setProductName(sc.next());
		System.out.println("Enter the supplier name");
		p.setSupplierName(sc.next());
		System.out.println("Product Id is "+p.getId());
		System.out.println("Product Name is "+p.getProductName());
		System.out.println("Supplier Name is "+p.getSupplierName());
		sc.close();
	}
}