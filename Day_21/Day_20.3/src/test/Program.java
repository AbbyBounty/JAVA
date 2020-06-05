package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static String pathname = "File.dat";
	public static void writeRecord(  ) {
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File(pathname));
			outputStream.write('A');
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void readRecord() {
		FileInputStream inputStream  = null;
		try {
			inputStream = new FileInputStream(new File(pathname));
			char ch = (char)inputStream.read();
			System.out.println(ch);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record.");
		System.out.println("2.Read Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice  = Program.menuList( ) ) != 0 ){
			switch( choice ) {
			case 1:
				Program.writeRecord();
				break;
			case 2:
				Program.readRecord();
				break;
			}
		}
	}
}
