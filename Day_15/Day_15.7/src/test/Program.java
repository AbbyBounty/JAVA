package test;

import java.util.Arrays;
import java.util.Comparator;

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
	@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
}
class SortByEmpid implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpid() - emp2.getEmpid();
	}
}
class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return (int) (emp1.getSalary() - emp2.getSalary());
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
	public static void print( Employee[] arr, Comparator<Employee> comparator ) {
		if( arr != null ) {
			Arrays.sort( arr, comparator );
			for (Employee emp : arr) {
				System.out.println(emp.toString());
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Employee[] arr =  Program.getEmployees();
		
		Program.print(arr,  new SortByName() );
		
		Program.print(arr, new SortByEmpid());
		
		Program.print(arr, new SortBySalary());
		
		Program.print(arr, null);
	}
	public static void main1(String[] args) {
		Employee[] arr =  Program.getEmployees();
		
		Comparator<Employee> comparator = null;
		
		comparator = new SortByName();	//Upcasting
		Arrays.sort(arr, comparator);
		Program.print(arr);
		
		comparator = new SortByEmpid();	//Upcasting
		Arrays.sort(arr, comparator);
		Program.print(arr);
		
		comparator = new SortBySalary();	//Upcasting
		Arrays.sort(arr, comparator);
		Program.print(arr);
	}
	
}
