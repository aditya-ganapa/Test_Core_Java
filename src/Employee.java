class Employee {
	/**
	 * empId is Employee Id
	 */
	
	
	long empId = 345;
	double empSalary = 10000;
	float empTax = 9.5f;
	int empDaysOfWork = 24;

	void calculateTax() {
		float taxRate = 10.5f;
		System.out.println("The Tax Rate Of The Employee is " + taxRate);
	}

	public static void main(String args[]) {
	//	calculateTax();
	}
}