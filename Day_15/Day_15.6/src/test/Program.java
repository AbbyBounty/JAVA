package test;

import java.util.Arrays;

class Employee implements Comparable<Employee>{
	private String name;
	private int empid;
	private float salary;
	public Employee() {
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getEmpid() {
		return empid;
	}
	public float getSalary() {
		return salary;
	}
	
//	@Override
//	public int compareTo(Employee other) {
//		
//		if( this.empid < other.empid )
//			return -1;
//		else if( this.empid > other.empid )
//			return 1;
//		return 0;
//	}
	
//	@Override
//	public int compareTo(Employee other) {
//		
//		return this.empid - other.empid;
//	}
	
//	@Override
//	public int compareTo(Employee other) {
//		
//		return (int) (this.salary - other.salary);
//	}
	
	@Override
	public int compareTo(Employee other) {
		
		return this.name.compareTo(other.name);
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
public class Program {
	private static Employee[] getEmployees( ){
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Rahul",15,50000.50f);
		arr[ 1 ] = new Employee("Umesh",11,40000.40f);
		arr[ 2 ] = new Employee("Amit",13,30000.50f);
		arr[ 3 ] = new Employee("Yogesh",14,20000.50f);
		arr[ 4 ] = new Employee("Sachin",12,10000.50f);
		return arr;
	}
	public static void print( Employee[] arr ) {
		if( arr != null ) {
			for (Employee emp : arr) {
				System.out.println(emp.toString());
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Employee[] arr =  Program.getEmployees();
		Program.print(arr);
		Arrays.sort( arr );	//mergesort
		Program.print(arr);
	}
	public static void main1(String[] args) {
		int[] arr = new int[ ] { 50, 10, 30, 40, 20 };
		Arrays.sort( arr );
		System.out.println(Arrays.toString( arr ));
	}
}
