package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
 
class Employee implements Comparable<Employee>{
	private String name;
	private int empid;
	private float salary;
	public Employee() {
		this("",0,0);
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
/*class SortByName implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
}
class SortByEmpid implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpid() - emp2.getEmpid();
	}
}
class SortBySalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
}*/
class SetTest
{
	private Set<Employee> empList;
	public void setEmpList(Set<Employee> empList) {
		this.empList = empList;
	}
	public void addRecord(Employee[] employees) 
	{
		if( this.empList != null && employees != null )
		{
			for( Employee emp : employees )
				this.empList.add(emp);
		}
	}
	public Employee findRecord(int empid)
	{
		if( this.empList != null )
		{
			for( Employee emp : this.empList)
			{
				if( emp.getEmpid() == empid )
					return emp;
			}
		}
		return null;
	}
	public boolean removeRecord(int empid)
	{
		if( this.empList != null )
		{
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key))
			{
				this.empList.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printRecord()
	{
		if( this.empList != null )
		{
			for( Employee emp : this.empList )
				System.out.println(emp.toString());
		}
	}
}
public class Program 
{
	private static Scanner sc = new Scanner(System.in);
	public static Employee[] getEmployees()
	{
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Prashant",15,50000);
		arr[ 1 ] = new Employee("Amit",11,45000);
		arr[ 2 ] = new Employee("Nitin",14,40000);
		arr[ 3 ] = new Employee("Yogesh",12,35000);
		arr[ 4 ] = new Employee("Sarang",13,30000);
		return arr;
	}
	private static void acceptRecord(int[] empid) {
		System.out.print("Enter empid	:	");
		empid[ 0 ] = sc.nextInt();
	}
	private static void printRecord(Employee emp)
	{
		if( emp != null )
			System.out.println(emp.toString());
		else
			System.out.println("Employee not found");
	}
	private static void printRecord(boolean removedStatus) 
	{
		if( removedStatus )
			System.out.println("Employee is removed");
		else
			System.out.println("Employee not found");
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Add Record");
		System.out.println("2.Find Record");
		System.out.println("3.Remove Record");
		System.out.println("4.Print Records[Sorted]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		int[] empid = new int[ 1 ];
		SetTest test = new SetTest();
		//test.setEmpList(new TreeSet<>());
		//test.setEmpList(new HashSet<Employee>());
		test.setEmpList(new LinkedHashSet<>());
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Employee[] employees = Program.getEmployees();
				test.addRecord( employees );
				break;
			case 2:
				Program.acceptRecord( empid );
				Employee emp = test.findRecord( empid[ 0 ] );
				Program.printRecord( emp );
				break;
			case 3:
				Program.acceptRecord( empid );
				boolean removedStatus = test.removeRecord( empid[ 0 ] );
				Program.printRecord(removedStatus);
				break;
			case 4:
				test.printRecord();
				break;
			}
		}
	}
}
