package in.com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TeatDelete {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		 
		
		Statement stmt=  conn.createStatement();
		String q= "delete from student where id = 2";
		stmt.executeUpdate(q);
		System.out.println("delete successfullt where id = 2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
