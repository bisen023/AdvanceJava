package in.com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepareStmt1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");

		
		 String q = "insert into management(id,name) values(?,?)";
		 PreparedStatement pstmt =conn.prepareStatement(q);
		 
		 pstmt.setInt(1,2);
		 pstmt.setString(2,"liywqdy");
		
		

		 
		 pstmt.executeUpdate();		 
		 System.out.println("data  successfully");
		 
		 
	}

}
