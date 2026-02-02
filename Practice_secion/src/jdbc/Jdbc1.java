package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;







public class Jdbc1 {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uss","root","9730");
		//Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id =sc.nextInt();
		System.out.println("Enter name");
		String name =sc.next();
		PreparedStatement pre = con.prepareStatement("insert into student values(? ,?)");
		pre.setInt(1, id);
		pre.setString(2, name);
		System.out.println("Statement created");
		//System.out.println(pre.execute());
		System.out.println(pre.executeUpdate());
		//int n = st.executeUpdate("insert into student values(5,'amar'),(6,'ankit');");
		
		//System.out.println("queries added"+n);
		pre.close();
		sc.close();
		con.close();
	}

}
