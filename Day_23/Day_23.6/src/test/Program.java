package test;

import java.util.List;

import dao.BookDao;
import pojo.Book;

public class Program {
	
	public static void print( List<Book> bookList ) {
		if( bookList != null ) {
			for (Book book : bookList) {
				System.out.println(book.toString());
			}
		}
	}
	public static void main(String[] args) {
		try( BookDao dao = new BookDao()){
			
			dao.delete( 5001 );
			
			List<Book> bookList =  dao.getBooks( );
			Program.print(bookList);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		try( BookDao dao = new BookDao()){
			
			dao.update( 5001, 350 );
			
			List<Book> bookList =  dao.getBooks( );
			Program.print(bookList);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try( BookDao dao = new BookDao()){
			Book book = new Book(5001, "ABC", "PQR", "XYZ", 500);
			dao.insert( book );
			
			List<Book> bookList =  dao.getBooks( );
			Program.print(bookList);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try( BookDao dao = new BookDao()){
			List<Book> bookList =  dao.getBooks( );
			Program.print(bookList);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
