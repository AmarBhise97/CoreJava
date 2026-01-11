package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Second {
	public static void main(String[]args) throws ClassNotFoundException, SQLException   {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","9730");
		Scanner sc = new Scanner(System.in);
		System.out.println("Id : ");
		int id = sc.nextInt();
		System.out.println("name : ");
		String name = sc.next();
		
		PreparedStatement ptmt = con.prepareStatement("insert into student values(?,?) ");
		ptmt.setInt(1, id);
		ptmt.setString(2, name);
		
		System.out.println("rows badalle :"+ptmt.executeUpdate());
		ptmt.close();
		con.close();
		sc.close();
	}

}
