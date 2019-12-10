package java_fundamentals;

public class q10_Trainee {
	private static final String COHORT_CODE="CHNAJ19004";
	private long employeeId;
	private String name;
	
	q10_Trainee(){
		employeeId=0;
		name=null;
	}
	q10_Trainee(long employeeId,String name){
		this.employeeId=employeeId;
		this.name=name;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCohortCode() {
		return COHORT_CODE;
	}
	
	void display(){
		System.out.println(getEmployeeId()+" "+getName()+" "+getCohortCode());
	}
}