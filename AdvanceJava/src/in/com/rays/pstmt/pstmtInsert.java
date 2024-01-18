package in.com.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class pstmtInsert {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

		//PreparedStatement pstmt = conn.prepareStatement("insert into music values(1,'ram')");
		PreparedStatement pstmt = conn.prepareStatement("insert into music values(?,?)");
		
		pstmt.setInt(1,101);
		pstmt.setString(2,"kripanshu");
		
		int i = pstmt.executeUpdate();

		System.out.println("inserted " + i);

	}

}
