package in.com.rays.user;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		
		System.out.println(d.getTime());
		
		//isse se ham util date to sql date me karege":
		System.out.println(new java.sql.Date(d.getTime()));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
