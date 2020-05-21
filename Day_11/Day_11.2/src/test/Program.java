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
		super.showRecord();
		System.out.println("Empid	:	" + this.empid);
		System.out.println("Salary	:	" + this.salary);
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("ABC", 23, 1122, 25000);
		//Person p = (Person)emp;	//OK : Upcasting
		Person p = emp;	//OK : Upcasting
		p.showRecord();
		//p.displayRecord();	//Not OK
	}
	public static void main5(String[] args) {
		Employee emp = new Employee("ABC", 23, 1122, 25000);
		//Person p = (Person)emp;	//OK : Upcasting
		Person p = emp;	//OK : Upcasting
		
		System.out.println(p.name);
		System.out.println(p.age);
		//System.out.println(p.empid);	//Not OK
		//System.out.println(p.salary);	//Not OK
	}
	public static void main4(String[] args) {
		Person p = new Person("ABC", 23);
		p.showRecord();
		System.out.println();
		//p.displayRecord();	//Not OK
	}
	public static void main3(String[] args) {
		Person p = new Person("ABC", 23);
		System.out.println(p.name);
		System.out.println(p.age);
		//System.out.println(p.empid);	//Not OK
		//System.out.println(p.salary);	//Not OK
	}
	public static void main2(String[] args) {
		Employee emp = new Employee("ABC", 23, 1122, 25000);
		emp.showRecord();
		System.out.println();
		emp.displayRecord();
	}
	public static void main1(String[] args) {
		
		Employee emp = new Employee("ABC", 23, 1122, 25000);
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.empid);
		System.out.println(emp.salary);
	}
}
