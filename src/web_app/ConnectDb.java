package web_app;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConnectDb {

	public static Connection con = null;
	
	public static Connection get_connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/blog_servlet", "root", "");
			//System.out.print("ok");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			//System.out.print("Loi");
		}
		return con;
		
	}

	
}
