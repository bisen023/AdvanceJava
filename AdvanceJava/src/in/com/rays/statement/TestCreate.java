package in.com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class TestCreate {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		Statement stmt = conn.createStatement();
		String query = "create table teacher (id int(56) not null ,name varchar(90) not null)";
		stmt.executeUpdate(query);
		System.out.println("createsuccesfull");

	}
}
