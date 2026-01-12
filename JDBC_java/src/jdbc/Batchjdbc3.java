package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Batchjdbc3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9730");
		PreparedStatement pre = con.prepareStatement("insert into student values(?,?);");

		Scanner sc = new Scanner(System.in);
		int count = 1;
		try {
		while (count < 5) {
			System.out.println("Id :");
			int id = sc.nextInt();
			System.out.println("Name :");
			String name = sc.next();
			pre.setInt(1, id);
			pre.setString(2, name);
			pre.addBatch();// in batch we have dupricat value can print than throw the exception.
			count++;
		}
		int[] arr = pre.executeBatch();

		for (int i : arr) {
			System.out.println(i);
		}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		pre.close();
		sc.close();
		con.close();

	}

}
