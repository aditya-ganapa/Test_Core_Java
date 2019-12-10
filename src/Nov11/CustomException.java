package Nov11;
class AdmissionAgeException extends Exception{
	public AdmissionAgeException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class CustomException {
	static void checkAge(int age) throws AdmissionAgeException{
		if(age<18)
			throw new AdmissionAgeException("Cannot be admitted to the course");
		else
			System.out.println("Admitted to the course");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			checkAge(10);
		} catch(Exception e){
			System.out.println("Exception occured:"+e.getMessage());
		}
		System.out.println("Done with the code");
	}
}