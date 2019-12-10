package Nov11;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo4 {
	void check(int a,int b) throws IOException,SQLException{
		if(b==0)
			throw new IOException("Denominator cannot be zero");
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo4 demo4=new ExceptionDemo4();
		try{
		demo4.check(10, 0);
		}
		catch(IOException | SQLException e){
			System.out.println(e.getMessage());
		}
	//	catch(SQLException e){
	//		System.out.println(e.getMessage());
	//	}
	}
}