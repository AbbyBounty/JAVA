package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Program {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/home_db";
	public static final String USER = "sandeep";
	public static final String PASSWORD = "sandeep";
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			 
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			statement = connection.createStatement();
			
			//String sql = "INSERT INTO BOOKS VALUES(5001,'ABC','PQR','XYZ', 500)";
			//String sql = "UPDATE BOOKS SET PRICE = 350 WHERE ID = 5001";
			String sql = "DELETE FROM BOOKS WHERE ID = 5001";
			int count = statement.executeUpdate(sql);
			System.out.println(count+" row(s) affected");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
