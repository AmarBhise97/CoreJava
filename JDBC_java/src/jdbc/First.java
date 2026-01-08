package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class First {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		
		/**
		first step to connect jdbc
		 but not used after java 6,java 8.
		 **/
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "9730");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", prop);
				Statement st = con.createStatement();) {// step 2 : connection the database
			System.out.println("Connection openetd :");
			
			
			int n = st.executeUpdate("insert into student values(3,'CDF'),(4,'ghi'),(5,'ldcc');");
			// step 3 : insert the data using eclips.....
			System.out.println("Insert the data " + n);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
