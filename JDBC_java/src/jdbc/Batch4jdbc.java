
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Batch4jdbc {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9730");
		PreparedStatement pre = con.prepareStatement("insert into student values(?,?);");
        con.setAutoCommit(false); 
        //when you can print aucommited true than
        //valese only duplicate not printed other values can be prited.
        
        //when autocommited can be false than one value can be duplicate 
        //than other any values can not print.
        
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
		 pre.executeBatch();
		 System.out.println("Executing the commit....");
		 con.commit();

		
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("Initializing the rollback............");
			con.rollback();
		}
		pre.close();
		sc.close();
		con.close();

	}

}
