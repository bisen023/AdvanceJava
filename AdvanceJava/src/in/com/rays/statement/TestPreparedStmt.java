package in.com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPreparedStmt {

	public static void main(String[] args) throws Exception {
	
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		 PreparedStatement pstmt = conn.prepareStatement("create table management(id int,  name varchar(40))");
		
		pstmt.executeUpdate();
		System.out.println("table created  management");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
