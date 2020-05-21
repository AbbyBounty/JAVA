package test;

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printRecord() {
		System.out.println("Name	:	" + this.name);
		System.out.println("Age	:	" + this.age);
	}
}
class Employee extends Person {
	private int empid;
	private float salary;
	public Employee() {
	}
	public Employee( String name, int age, int empid, float salary ) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord() {
		super.printRecord();
		System.out.println("Empid	:	" + this.empid);
		System.out.println("Salary	:	" + this.salary);
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Abc",23,1122,25000);
		emp.printRecord();
	}
}
