package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable{
	private static final long serialVersionUID = 3974710014385572180L;
	private String name;
	private int empid;
	private transient float salary;
	public Employee() {
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
}
public class Program {
	static Scanner sc = new Scanner(System.in);
	public static String pathname = "File.dat";
	public static void writeRecord(  ) throws Exception{
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream( new FileOutputStream(new File(pathname))) );){
			
			Employee emp = new Employee("ABC", 123, 45000.50f);
			outputStream.writeObject(emp);
		} 
	}
	public static void readRecord() throws Exception {
		try( ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))));) {
			 Employee emp = (Employee) inputStream.readObject();
			 System.out.println(emp);
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
