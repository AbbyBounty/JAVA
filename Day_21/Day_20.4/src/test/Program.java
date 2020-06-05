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
	public static void writeRecord(  ) throws Exception{
		try (FileOutputStream outputStream = new FileOutputStream(new File(pathname));){
			outputStream.write('A');
		} 
	}
	public static void readRecord() throws Exception {
		try( FileInputStream inputStream = new FileInputStream(new File(pathname));) {
			char ch = (char)inputStream.read();
			System.out.println(ch);
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
			try {
				switch( choice ) {
				case 1:
					Program.writeRecord();
					break;
				case 2:
					Program.readRecord();
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
