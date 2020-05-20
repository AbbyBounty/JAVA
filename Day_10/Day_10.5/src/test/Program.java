package test;

class Person{
	//Field/Property
	 String name;
	 int age;
	public Person() {
		this.name = "";
		this.age = 0;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Method/Behavior
	public void showRecord() {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
	public static void test()
	{
		System.out.println("Inside static method");
	}
}
class Employee extends Person{
	 int empid;
	 float salary;
	public Employee() {
		super();
		this.empid = 0;
		this.salary = 0;
	}
	public Employee(String name, int age, int empid, float salary) {
		super(name,age);
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord() {
		this.showRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee("Abc",23,4215,32000);
		emp.displayRecord();
	}
	public static void main5(String[] args) {
		//Person p1 = new Person();
		//Person p2 = new Person("Aakash", 24);
		//Employee e1 = new Employee();
		Employee e2 = new Employee("Abc",23,4215,32000);

	}
	public static void main4(String[] args) {
		Person.test();
		Employee.test();
	}
	public static void main3(String[] args) {
		Employee emp = new Employee("Abc",23,4215,32000);
		emp.showRecord();
		emp.displayRecord();
	}
	
	public static void main2(String[] args) {
		Employee emp = new Employee("Abc",23,4215,32000);
		emp.displayRecord();
	}
	public static void main1(String[] args) {
		Person p = new Person("Abc",23);
		p.showRecord();
	}
}
