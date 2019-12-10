
public class MainProgram {

	public static void main(String args[]){
		Employee a=new Employee();
		System.out.println("The Id of the Emplyee is "+a.empId);
		System.out.println("The Salary of the Emplyee is "+a.empSalary);
		System.out.println("The Percentage of Tax The Employee needs to Pay is "+a.empTax);
		System.out.println("The Total Number of Working Days is "+a.empDaysOfWork);
		a.calculateTax();
	}
}
