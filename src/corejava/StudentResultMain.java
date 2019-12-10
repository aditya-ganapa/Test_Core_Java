package corejava;

public class StudentResultMain {
	public static void main(String[] args) {
		Student student=new Student();
		student.roll=4;
		student.name="adi";
		student.marks1=41.3f;
		student.marks2=65.6f;
		
		Result result;
		
		ResultCalculate calculate=new ResultCalculate();
		
		result=calculate.studResult(student);
		
		System.out.println(result.roll_name);
		System.out.println(result.total_marks);
		System.out.println(result.percentage);
		System.out.println(result.grade);
	}
}
