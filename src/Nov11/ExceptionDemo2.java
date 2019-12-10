package Nov11;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		try{
			System.out.println("Result is:"+10/1);
			int ar[]={1,2,3,4};
			System.out.println("Result is:"+ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index error at position "+e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero error");
		}
		catch(Exception e){
			System.out.println("Some error "+e.getMessage());
		} finally{
			System.out.println("Finally block");
		}
		System.out.println("Program ends");
	}
}