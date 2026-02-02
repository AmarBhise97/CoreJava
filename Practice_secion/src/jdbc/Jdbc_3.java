package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Jdbc_3 {
	public static void main(String[]args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uss","root","9730");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id=sc.nextInt();
		System.out.println("Enter the name : ");
		String name=sc.next();
		PreparedStatement pre = con.prepareStatement("insert into student values(?,?);");
		 pre.setInt(1, id);
		 pre.setInt(1, id);
		 pre.setInt(1, id);
		 pre.setString(2, name);
		 pre.setString(2, name);
		 pre.setString(2, name);
		 System.out.println(pre.executeBatch());
	}
	
	public static void main3(String[]args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/uss","root","9730");
		Statement st = con.createStatement();
		String f1=("insert into student values(1,'statement');");
		String f2=("insert into student values(2,'stat2');");
		String f3=("insert into student values(3,'stat3');");
		
		st.addBatch(f1);
		st.addBatch(f2);
		st.addBatch(f3);
		int arr[]=st.executeBatch();
		
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void main2(String[]args) throws SQLException {
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/uss","root","9730");
		int id=1;
		String name="Amar";
		
		PreparedStatement pre = con.prepareStatement("insert into student values(?,?)");
		pre.setInt(1, id);
		pre.setString(2, name);
		
		System.out.println(pre.executeUpdate());
		pre.close();
		con.close();
	}
	
	public static void main1(String[]args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uss","root","9730");
		Statement st =con.createStatement();
		
		System.out.println("Connect the database....");
		
		int n=st.executeUpdate("insert into student values(1,'anr');");
		System.out.println(n);
	}

}
