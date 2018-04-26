package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("JDBC Drivers loaded");
		
		//make a connection to the mysql database
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		
		System.out.println("Connection is completed");
		
		//Send Query to the database
		
		Statement stmt = con.createStatement();
		
		//Execute query 
		
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		
		while(rs.next()) {
			
			String x= rs.getString(1);
			
			String y =rs.getString(2);
			
			int z =rs.getInt(3);
			
			System.out.println(x+"  "+y+"  "+z);
			
		}
		
	}

}
