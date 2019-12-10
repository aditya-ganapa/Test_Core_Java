package Nov11;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10/0); Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(10/0.0);
		int ar[]={1,2,3,4,5};
		//System.out.println(ar[6]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
		String s="hello";
		//System.out.println(s.charAt(6)); Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
		//int p=Integer.parseInt(s); Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
		//System.out.println(p);
		String s1=null;
		//System.out.println(s1.length()); Exception in thread "main" java.lang.NullPointerException
	}
}