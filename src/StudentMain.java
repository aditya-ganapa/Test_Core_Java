
public class StudentMain {
	
	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.roll=1201;
		student.name="abcd";
		student.marks=12.3f;
		
		System.out.println("roll no is "+student.roll);
		System.out.println("name is "+student.name);
		System.out.println("marks is "+student.marks);
		
		student.study();
		student.exam();
		
	}

}
