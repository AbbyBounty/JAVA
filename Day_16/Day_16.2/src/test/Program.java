package test;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
		list1.clear();
		
		for( Integer element : list1 )
			System.out.println(element);
		System.out.println();
		for( Integer element : list2 )
			System.out.println(element);
	}
	public static void main2(String[] args) {
		
		try {
			Employee emp1 = new Employee("Sandeep",33,45000,26,12,2006);
			Employee emp2 = emp1.clone();	//Shallow Copy of references.
			
			emp1.getJoinDate().setDay(28);
			emp1.getJoinDate().setMonth(5);
			emp1.getJoinDate().setYear(2020);
			
			System.out.println(emp1.toString());
			System.out.println(emp2.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		Employee emp1 = new Employee("Sandeep",33,45000,26,12,2006);
		Employee emp2 = emp1;	//Shallow Copy of references.
	}
}
