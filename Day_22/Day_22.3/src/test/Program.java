package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {
	public static String pathname = "File.txt";
	static Scanner sc = new Scanner(System.in);
	public static void writeRecord(  ) throws Exception{
		try( BufferedWriter writer = new BufferedWriter(new FileWriter( new File(pathname)))){
			writer.write("Sandeep Kulange");
			writer.newLine();
			writer.write("Sunbeam Infotech Pune");
			writer.newLine();
			writer.write("Hinjewadi, Pune");
			writer.newLine();
			writer.write("411057");
		}
	}
	public static void readRecord(  ) throws Exception{
		try( BufferedReader reader = new BufferedReader(new FileReader(new File(pathname)))){
			String line = "";
			while((line = reader.readLine( ) ) != null ) {
				System.out.println(line);
			}
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
