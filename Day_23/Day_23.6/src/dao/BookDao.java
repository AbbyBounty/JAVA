package dao;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DBUtils;

public class BookDao implements Closeable{
	private Connection connection;
	private Statement statement;
	public BookDao() throws Exception {
		this.connection = DBUtils.getConnection();
		this.statement = this.connection.createStatement();
	}
	
	//TODO : CRUD
	public int insert(Book book) throws Exception {
		String sql = "INSERT INTO BOOKS VALUES("+book.getId()+",'"+book.getName()+"','"+book.getAuthor()+"','"+book.getSubject()+"',"+book.getPrice()+")";
		int count = this.statement.executeUpdate(sql);
		return count;
	}
	public int update(int bookId, float price) throws Exception {
		String sql = "UPDATE BOOKS SET price="+price+" WHERE ID="+bookId+"";
		int count = this.statement.executeUpdate(sql);
		return count;
	}
	public int delete(int bookId) throws Exception {
		String sql = "DELETE FROM BOOKS  WHERE ID="+bookId+"";
		int count = this.statement.executeUpdate(sql);
		return count;
	}
	public List<Book> getBooks() throws Exception{
		String sql = "SELECT * FROM BOOKS";
		List<Book> bookList = new ArrayList<Book>();
		try( ResultSet rs = this.statement.executeQuery(sql)){
			while( rs.next()) {
				Book book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
				bookList.add(book);
			}	
		}
		return bookList;
	}
	@Override
	public void close() throws IOException {
		try {
			this.statement.close();
			this.connection.close();
		} catch (SQLException e) {
			throw new IOException(e);	//Exception Chaining
		}
	}
}
