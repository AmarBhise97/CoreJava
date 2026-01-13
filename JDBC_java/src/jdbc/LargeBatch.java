package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LargeBatch {
	public static void main(String[]args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9730");
		PreparedStatement pre = con.prepareStatement("insert into student values(?,?);");
		
		int count =1;
		while(count<1500) {
			pre.setInt(1, count);
			pre.setString(2, "A"+count);
			pre.addBatch();
			count++;
			if(count%15==0){
				System.out.println("Batch full executing the batch.....");
				long[]arr=pre.executeLargeBatch();
				for(long i:arr) {
					System.out.println(i);
				}
				
			}
		}
		
	}

}
