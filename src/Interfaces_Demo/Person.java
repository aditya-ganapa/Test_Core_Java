package Interfaces_Demo;

public class Person {
	int id;
	String name;
	Address addr;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		Address address=new Address("1st","blr","karnataka","india");
		person.setId(12);
		person.setName("Adi");
		person.setAddr(address);
		System.out.println("Personal Info:");
		System.out.println("Id is "+person.getId());
		System.out.println("Name is "+person.getName());
		System.out.println("Address:");
		System.out.println("Street is "+person.getAddr().getStreet());
		System.out.println("City is "+person.getAddr().getCity());
		System.out.println("State is "+person.getAddr().getState());
		System.out.println("Country is "+person.getAddr().getCountry());
	}

}
