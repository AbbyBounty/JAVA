package test;

class Person {
	 String name;
	 int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showRecord() {
		System.out.println("Name	:	" + this.name);
		System.out.println("Age	:	" + this.age);
	}
}

class Employee extends Person {
	 int empid;
	 float salary;
	public Employee() {
	}
	public Employee( String name, int age, int empid, float salary ) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord() {
		//super.showRecord();
		System.out.println("Empid	:	" + this.empid);
		System.out.println("Salary	:	" + this.salary);
	}
}

public class Program {
	public static void main(String[] args) {
		Person p = new Person();
		Employee emp = (Employee) p;	//Downcasting
		System.out.println(emp);
	}
	public static void main1(String[] args) {
		Person p = new Employee("ABC", 23, 1122, 25000);	//OK: Upcasitng
		p.showRecord();
		Employee emp = (Employee) p;	//Downcasting
		emp.displayRecord();
		
	}
}
