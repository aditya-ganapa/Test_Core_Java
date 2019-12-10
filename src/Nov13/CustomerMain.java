package Nov13;

import java.util.ArrayList;
import java.util.Collections;

class CustomerMain{
	public static void main(String[] args) {
		ArrayList<Customer> cust_list=new ArrayList<Customer>();
		int id1[]={100,90,110};
		String name1[]={"ram","shyam","ghanshyam"};
		Customer customer;
		for (int i = 0; i < name1.length; i++) {
			customer=null;
			customer=new Customer();
			customer.setId(id1[i]);
			customer.setName(name1[i]);
			cust_list.add(customer);
		}
		Collections.sort(cust_list);
	//	System.out.println(cust_list);
		for (Customer customer2 : cust_list) {
			System.out.println(customer2.getId()+" "+customer2.getName());
		}
	}
}