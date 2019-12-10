package corejava;

public class UserInfo {
	String fn,ln;
	String fullName(String f,String l){
		return f+" "+l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfo A=new UserInfo();
		A.fn="abcd";
		A.ln="efgh";
		System.out.println("First name is:"+A.fn);
		System.out.println("Last name is:"+A.ln);
		System.out.println("Full name is:"+A.fullName(A.fn,A.ln));
	}

}
