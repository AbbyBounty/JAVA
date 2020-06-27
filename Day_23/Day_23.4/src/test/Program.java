package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DBUtils;
public class Program {
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			
			connection = DBUtils.getConnection();
			statement = connection.createStatement();
			String sql = "SELECT * FROM BOOKS";
			ResultSet rs = statement.executeQuery(sql);
			while( rs.next()) {
				//int bookId = rs.getInt(1);
				int bookId = rs.getInt("ID");
				
				//String bookName = rs.getString(2);
				String bookName = rs.getString("NAME");
				
				//String authorName = rs.getString(3);
				String authorName = rs.getString("AUTHOR");
				
				//String subjectName = rs.getString(4);
				String subjectName = rs.getString("SUBJECT");
				
				//float price = rs.getFloat(5);
				float price = rs.getFloat("PRICE");
				
				System.out.printf("%-5d%-30s%-20s%-20s%-10.2f\n", bookId, bookName, authorName, subjectName, price );
			}
			
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
