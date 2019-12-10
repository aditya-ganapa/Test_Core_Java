package dec7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Statement;

public class DataBaseDemo1 {
	public static void main(String[] args) {
		try {
		//	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db10", "root", "password-1");
			if(connection!=null)
				System.out.println("connection succesful");
			else
				System.out.println("connection problem");
			java.sql.Statement st = connection.createStatement();
		//	Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
		//	rs.next();
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		//	System.out.println(rs.getInt("roll")+" "+rs.getString("name")+" "+rs.getString("class")+" "+rs.getString("location")+" "+rs.getInt("marks"));
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}