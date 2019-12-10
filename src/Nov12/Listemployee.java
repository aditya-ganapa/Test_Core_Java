package Nov12;
import java.util.List;
import java.util.ArrayList;

public class Listemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<Employee>();
		Employee emp1=new Employee(101, "TOM", "HR", 10000);
		Employee emp2=new Employee(102, "JIM", "ADM", 20000);
		Employee emp3=new Employee(103, "MARK", "IT", 30000);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		for (Employee employee : empList) {
			System.out.println(employee.id+" "+employee.name+" "+employee.dept+" "+employee.salary);
		}
	}

}
