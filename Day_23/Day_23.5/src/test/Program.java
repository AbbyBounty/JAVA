package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.Book;
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
			/*while( rs.next()) {
				
				Book book = new Book();
				int bookId = rs.getInt("ID");
				book.setId(bookId);
			
				String bookName = rs.getString("NAME");
				book.setName(bookName);
			
				String authorName = rs.getString("AUTHOR");
				book.setAuthor(authorName);
			
				String subjectName = rs.getString("SUBJECT");
				book.setSubject(subjectName);

				float price = rs.getFloat("PRICE");
				book.setPrice(price);
				
				
				System.out.println(book.toString());
			}*/
			
			while( rs.next()) {
				
				Book book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
				System.out.println(book.toString());
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
