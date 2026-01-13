package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Autocommit12 {
	public static void main(String[]args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9730");
		
		PreparedStatement pre = con.prepareStatement("insert into student values(?,?);");
		
		con.setAutoCommit(false);
		Scanner se = new Scanner(System.in);
		int counter=0;
		while(counter<3) {
		System.out.println("ID :");
		int id = se.nextInt();
		System.out.println("Name :");
		String name=se.next();
		pre.setInt(1, id);
		pre.setString(2, name);
		pre.addBatch();
		counter++;
		}
		int[]arr=pre.executeBatch();
		Thread.sleep(20000);
		System.out.println("Commiting the changes......");
		con.commit();
		for(int i:arr) {
			System.out.println(i);
		}
		se.close();
		pre.close();
		con.close();
		
	}

}
