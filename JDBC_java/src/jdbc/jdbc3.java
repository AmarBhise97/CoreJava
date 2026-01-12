package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9730");

		Statement st = con.createStatement();
		String first = "insert into student values(10,'Amar');";
		String second = "insert into student value(11,'ankit');";
		String third = "insert into student value(10,'gagan');";
		//10 is  duplicate this value in batch one duplicate value than throw
		// exception but other can print the values.

		st.addBatch(first);
		st.addBatch(second);
		st.addBatch(third);

		int arr[] = st.executeBatch();

		for (int i : arr) {
			System.out.println(i);
		}

		st.close();
		con.close();

	}

}

class student {
	int id;
	String name;

	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
