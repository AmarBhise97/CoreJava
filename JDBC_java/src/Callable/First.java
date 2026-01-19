package Callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class First {
	public static void main(String[]args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","9730");
		CallableStatement call = con.prepareCall("{call getbyid(?)}");
		call.setInt(1, 2);
		//call.setString(2, "Ankit");
		ResultSet set = call.executeQuery();
		while(set.next()) {
			System.out.println(set.getInt(1));	
		System.out.println(set.getString(2));
		
		System.out.println("===================================");
		
		}
		call.close();
		con.close();
		set.close();
		
	}

}
