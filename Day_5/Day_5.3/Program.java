import java.util.Scanner;
class Employee
{
    String name;
    int empid;
    float salary;
    Employee( )
    {
        this("",0,0);
    }
    Employee( String name, int empid, float salary)
    {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    void acceptRecord( )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name  :   ");
        this.name = sc.nextLine();
        System.out.print("Empid :   ");
        this.empid = sc.nextInt();
        System.out.print("Salary    :   ");
        this.salary = sc.nextFloat();
    }
    void printRecord( )
    {
        System.out.printf("%-15s%-5d%-10.2f\n", this.name, this.empid, this.salary);
    }
}
class Program
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee();
        emp.acceptRecord( );
        emp.printRecord( );
    }
}