package Nov21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	private int id;
	private String name;
	private float salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class EmployeeSort {
	public static void main(String[] args) {
		/*Comparator<Employee> comparator=new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};*/
		
		Comparator<Employee> comparator=(o1,o2)->{return o1.getName().compareTo(o2.getName());};
		Comparator<Employee> comparator2=(o1,o2)->{return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));};
		
		// TODO Auto-generated method stub
		Employee employee[]=new Employee[3];
		int id[]={343,562,234};
		String name[]={"zxcvb","qwerty","asdfg"};
		float salary[]={43431,65466,23455};
		ArrayList<Employee> employees=new ArrayList<>();
		for (int i = 0; i < salary.length; i++) {
			employee[i]=new Employee();
			employee[i].setId(id[i]);
			employee[i].setName(name[i]);
			employee[i].setSalary(salary[i]);
			employees.add(employee[i]);
		}
		Collections.sort(employees,comparator);
		for (Employee employee2 : employees) {
			System.out.println(employee2.getId()+" "+employee2.getName()+" "+employee2.getSalary());
		}
		Collections.sort(employees,comparator2);
		for (Employee employee2 : employees) {
			System.out.println(employee2.getId()+" "+employee2.getName()+" "+employee2.getSalary());
		}
	}
}