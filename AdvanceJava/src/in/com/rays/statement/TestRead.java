package in.com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class TestRead {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		String query = "select*from student";
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(query);
		
		
		
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(  "\t"+rs.getInt(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getInt(5));
			System.out.println("\t"+rs.getInt(6));
		
		}
		
		
		

	}

}
