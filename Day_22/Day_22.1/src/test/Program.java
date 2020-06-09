package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {

	public static String pathname = "File.txt";
	static Scanner sc = new Scanner(System.in);
	public static void writeRecord(  ) throws Exception{
		try( FileWriter writer = new FileWriter( new File(pathname))){
			for( char ch = 'A'; ch <= 'Z'; ++ ch ) {
				writer.write(ch);
			}
		}
	}
	public static void readRecord(  ) throws Exception{
		try( FileReader reader = new FileReader(new File(pathname))){
			int data;
			while((data = reader.read( ) ) != -1 ) 
				System.out.print((char)data+" ");
			System.out.println();
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record");
		System.out.println("2.Read Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			try {
				switch(choice) {
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
