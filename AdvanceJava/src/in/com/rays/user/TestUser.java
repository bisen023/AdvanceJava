package in.com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {

	public static void main(String[] args) throws Exception {

	 testAdd();

		//testUpdate();
		// testDelete();
		//testSearch();
		//testFindByPK();
		//testFindByLoginId();
		
	}

	
	private static void testFindByLoginId() throws Exception {
		UserModel model= new UserModel();
		UserBean bean = model.testLoginId("sattan@fgmail.com");
		
		if (bean != null) {
			
			System.out.print(bean.getId());
			System.out.print("   || "+bean.getFirstName());
			System.out.print("   || "+bean.getLastName());
			System.out.print("   || "+bean.getLoginId());
			System.out.print("   || "+bean.getPassword());
			System.out.print("   || "+bean.getDob());
			System.out.println("  || "+bean.getAddress());	
			
		}else {
			
			System.out.println("loginId invalid");
			
		}
		
	}


	private static void testFindByPK()  throws Exception {
		
		UserModel model = new UserModel();
		UserBean bean = model.findByPK(2);
		
		
		          
		 if (bean != null) {
			 System.out.print(bean.getId());
			 System.out.print("\t"+bean.getFirstName());
			 System.out.print("\t"+bean.getLastName());
			 System.out.print("\t"+bean.getLoginId());
			 System.out.print("\t"+bean.getPassword());
			 System.out.print("\t"+bean.getDob());
			 System.out.println("\t"+bean.getAddress());
			
		} else {
			
			 System.out.println("id does not exist");
			 
			
		 }
		
	}


	private static void testSearch() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();
		bean.setFirstName("s");
		bean.setDob(new SimpleDateFormat("dd-MM-yyyy").parse("27-12-2001"));

		List list = model.search(bean, 1, 5);
		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println(bean.getAddress());

		}

	}

	private static void testDelete() throws Exception {

		UserModel model = new UserModel();
		model.Delete(3);
		
	UserBean existbean =	model.findByPK(2);
		
		if (existbean != null) {
			
			model.Delete(existbean.getId() );;
		
		}else {
			
			System.out.println("id not found ...!!");
		
		}
		
		

	}

	private static void testUpdate() throws Exception {
		UserModel model = new UserModel();
		UserBean bean = model.findByPK(3);
		
		

		bean.setFirstName("gaurav");
		bean.setLastName("rajpoot");
		bean.setLoginId("gaurav@gmail.com");
		bean.setPassword("hhjf");
		bean.setDob(new SimpleDateFormat("dd-MM-yyyy").parse("25-09-2002"));
		bean.setAddress("bhopal");
		bean.setId(4);

		
		
		model.update(bean);

	}

	private static void testAdd() throws Exception {
//String s ="23-10-2001";
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		
//		Date d = sdf.parse(s);

		UserBean bean = new UserBean();

		bean.setId(8);
		bean.setFirstName("vijay ");
		bean.setLastName("rathor");
		bean.setLoginId("vijay@gmail.com");

		bean.setPassword("vijay@123");
		bean.setDob(new SimpleDateFormat("dd-MM-yyyy").parse("10-11-2002"));
		bean.setAddress("sheopur");

		UserModel model = new UserModel();
		model.add(bean);

	}
}

