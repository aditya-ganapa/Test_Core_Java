package Nov11;
public class ExceptionDemo3 {
	static void CheckEligibility(int age){
		if(age<18)
			throw new ArithmeticException("Not eligible to join university");
		else
			System.out.println("Welcome to university");
		System.out.println("Fine with age");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		CheckEligibility(10);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}

	}
}