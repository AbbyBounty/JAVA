package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Step 0 : include JDBC connector into Runtime classpath/build path
public class Program {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Step 1: Load and register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2: Establish Connetion using users credential 
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/home_db", "sandeep", "sandeep");
			
			//Step 3: Create Statement/PreparedStatement/CallableStatement to execute query
			statement = connection.createStatement();
			
			//Step 4: Prepare and execute query
			String sql = "";
			//statement.executeUpdate(sql);	//DML : Insert/Update/Delete
			//ResultSet rs =  statement.executeQuery(sql);	//DQL : Select
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//Step 5: Close resources
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
