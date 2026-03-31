package Callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Third_1 {

	public static void main(String[] args) throws SQLException, InterruptedException {

		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","9730");
		CallableStatement call = con.prepareCall("{call find()}");
		
		//call.setInt(1, 2);
		ResultSet set = call.executeQuery();
		
		while(set.next()) {
			Thread.sleep(2000);
			System.out.println(set.getInt(1));	
			System.out.println(set.getString(2));
		
		
		System.out.println("===================================");
		}
		con.close();
		call.close();
		set.close();
		

}
}
