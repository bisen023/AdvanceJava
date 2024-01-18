package in.com.rays.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {

	public void add(MarksheetBean bean) throws Exception {
		int pk = nextPk();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");

		pstmt.setInt(1,pk);
		pstmt.setInt(2, bean.getRollNO());
		pstmt.setString(3, bean.getName());
		pstmt.setInt(4, bean.getPhy());
		pstmt.setInt(5, bean.getChem());
		pstmt.setInt(6, bean.getMaths());

		pstmt.executeUpdate();
		System.out.println("ho gya  kaam");
	}

	public void update(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("update marksheet set roll_no = ? where id =?");

		pstmt.setInt(1, bean.getRollNO());
		pstmt.setString(2, bean.getName());
		pstmt.setInt(3, bean.getPhy());
		pstmt.setInt(4, bean.getChem());
		pstmt.setInt(5, bean.getMaths());
		pstmt.setInt(2, bean.getId());
		pstmt.executeUpdate();

		System.out.println("updated data successfully");
	}

	public void delete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("delete from marksheet where id =?");

		pstmt.setInt(1, id);

		int i = pstmt.executeUpdate();
		System.out.println("deletted successfully");

	}

	public void readAll() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("select*from marksheet");
		ResultSet set = pstmt.executeQuery();
		while (set.next()) {
			System.out.print(set.getInt(1));
			System.out.print("\t" + set.getInt(2));
			System.out.print("\t" + set.getString(3));
			System.out.print("\t" + set.getInt(4));
			System.out.print("\t" + set.getInt(5));
			System.out.println("\t" + set.getInt(6));
		}
	}

	public MarksheetBean findByPk(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		PreparedStatement pstmt = conn.prepareStatement("select * from marksheet where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		MarksheetBean bean = null;
		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRollNO(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhy(rs.getInt(4));
			bean.setChem(rs.getInt(5));
			bean.setMaths(rs.getInt(6));

		}
		return bean;

	}

	public List search(MarksheetBean bean, int PageNo, int PageSize) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		StringBuffer sql = new StringBuffer("select*from marksheet where 1=1");
System.out.println("sql ======>>>>"+sql);
		if (bean != null) {

			if(bean.getName() !=null && bean.getName().length() >0) {
				sql.append(" and name like '" + bean.getName() + "%'");
			}

			if (bean.getRollNO() > 0) {

				sql.append(" and roll_no = " + bean.getRollNO());
			}

		}

		if (PageSize > 0) {
			PageNo = (PageNo - 1) * PageSize;
			sql.append(" limit " + PageNo + "," + PageSize);

		}

		PreparedStatement pstmt = conn.prepareStatement(sql.toString());

		ResultSet rs = pstmt.executeQuery();
		List list = new ArrayList();

		while (rs.next()) {

			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRollNO(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setId(rs.getInt(4));
			bean.setPhy(rs.getInt(5));
			bean.setChem(rs.getInt(6));
			list.add(bean);

		}
		return list;

	}
	
	
	public Integer nextPk()  throws Exception{
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		
		PreparedStatement pstmt = conn.prepareStatement("select max(id) from marksheet");
		
		 ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			
			  pk = rs.getInt(1);
			
			
			
			
		}
		return pk+1;
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
