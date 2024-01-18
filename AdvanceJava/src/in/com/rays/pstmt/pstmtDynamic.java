package in.com.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class pstmtDynamic {

	public static void main(String[] args) throws Exception {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysq1://localhost:3306/school","root","root");
		
		
		  PreparedStatement pstmt = conn.prepareStatement("insert into student1 values(?,?,?,?,?))");
		
		
		pstmt.setInt(1,1 );
		pstmt.setString(2,"satyam");
		pstmt.setInt(3,44 );
		pstmt.setInt(4,55 );
		pstmt.setInt(5,77 );
		
		int i =pstmt.executeUpdate();
		
		System.out.println("dynamcic insettred");
		
		
		
		
		
		
		
		
		
		
	}

}
