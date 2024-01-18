package in.com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		Statement stmt  = conn.createStatement();
		stmt.executeUpdate("insert into student values(11,111,'shyam',56,78)");
		
		
		System.out.println("inmserted");
	}
}
