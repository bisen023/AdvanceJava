package in.com.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class pstmtCreate {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("create table music(id int primary key,name varchar(30))");

		pstmt.executeUpdate();
		System.out.println("table created byy pstmt");
	}
}
