package pageobjectdemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper {
	List<String> userInfo = new ArrayList<>();
	//jdbc:mysql://localhost:3306/?user=root  retailsite	
	public List<String> fetchDBData(String firstName) throws SQLException, ClassNotFoundException {
		
	 String sqlQuery = "Select * from userinfo where firstName ='"+firstName+"'";
		
	// 1) My SQL connector library should be added to dependencies
	
	// 2) Establish the Connection to the DB & JDBC Driver & Class for instantiation 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = 
		DriverManager.getConnection("jdbc:mysql://localhost:3306/retailsite", "root", "password");
	
	// 3) Create a SQL Statement so that it could be run the SQL query 
		Statement statement = connect.createStatement();
	
	// 4) Execute the query and save the results ResultSet object 
		ResultSet result = statement.executeQuery(sqlQuery);
	
	// 5) Retrieve the data from the ResultSet object 
		while(result.next()) {
			System.out.print(result.getString(1)+ " , ");
			System.out.print(result.getString(2)+ " , ");
			System.out.print(result.getString(3)+ " , ");
			System.out.print(result.getString(4)+ " , ");
			System.out.print(result.getString(5)+ " , ");
			System.out.print(result.getString(6)+ " , ");
			System.out.print(result.getInt(7)+ " , ");
			System.out.print(result.getString(8)+ " , ");
			System.out.println();
			userInfo.add(result.getString(1));
			userInfo.add(result.getString(2));
			userInfo.add(result.getString(3));
			userInfo.add(result.getString(4));
			userInfo.add(result.getString(5));
			userInfo.add(result.getString(6));
	
		}
		
		return userInfo;
		
	}

}
