package org;

public class Employee {
	int id;
	String name;
	String location;
	float salary;
}

class Manager extends Employee{
	public static void main(String[] args) {
		Manager m=new Manager();
		m.id=4;
		m.name="adi";
		m.location="blr";
		m.salary=1000;
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.location);
		System.out.println(m.salary);
	}
}

class Programmer extends Employee{
	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.id=5;
		p.name="ad";
		p.location="chn";
		p.salary=500;
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.location);
		System.out.println(p.salary);
	}
}

class Admin extends Employee{
	public static void main(String[] args) {
		Admin a=new Admin();
		a.id=6;
		a.name="aditya";
		a.location="hyd";
		a.salary=10000;
		System.out.println(a.id);
		System.out.println(a.name);
		System.out.println(a.location);
		System.out.println(a.salary);
	}
}