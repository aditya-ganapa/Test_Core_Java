package corejava;
public class Student {
	String name;
	int roll;
	float marks1;
	float marks2;
}
class Result {
	String roll_name;
	String grade;
	float total_marks;
	float percentage;
}
class ResultCalculate {
	Result studResult(Student s){
		Result result=new Result();
		result.roll_name="roll is "+s.roll+"\nname is "+s.name;
		result.total_marks=s.marks1+s.marks2;
		result.percentage=result.total_marks/2;
		if(result.percentage>=35)
			result.grade="pass";
		else
			result.grade="fail";
		return result; 
	}
}