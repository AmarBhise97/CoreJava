package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9730");
		PreparedStatement st = con.prepareStatement("insert into student  values(?,?)");
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		while (counter < 5) {

			System.out.println("Enter id :");
			int id = sc.nextInt();
			System.out.println("Enter name :");
			String name = sc.next();

			st.setInt(1, id);
			st.setString(2, name);

			System.out.println(st.executeUpdate() + counter++);

		}
		sc.close();
		con.close();
		st.close();

	}

}
