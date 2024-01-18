package in.com.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class pstmtUpdate {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
	
	//PreparedStatement pstmt =conn.prepareStatement("update music set name='aman' where id =102");
	PreparedStatement pstmt =conn.prepareStatement("update music set name=? where id =?");
	
	pstmt.setInt(1, 103);
	
	pstmt.setString(2, "riya");
	
	pstmt.executeUpdate();
	System.out.println("update succesfully");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
