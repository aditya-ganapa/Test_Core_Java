
public class Test6 {

	public static void main(String[] args) {
		boolean status=true;
		System.out.println(status+" "+(!status));

		int marks1=45,marks2=54;
		if(marks1<35||marks2<35)
			System.out.println("Fail");
		else
			System.out.println("Pass");
		
		int x=96;
		if(x<100&&x>90)
			System.out.println("x lies between 90 and 100");
		else
			System.out.println("x doesn't lie between 90 and 100");
		
	}

}
