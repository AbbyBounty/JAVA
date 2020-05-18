class Employee
{
    private String name;
    private int empid;
    private String department;
    private String designation;
    private String joinDate;
    private float salary;
    public Employee( )
    {   }
    public Employee(  String name, int empid, String department, String designation,String joinDate, float salary)
    {
        this.name = name;
        this.empid = empid;
        this.department = department;
        this.designation = designation;
        this.joinDate = joinDate;
        this.salary = salary;
    }
    public void print( )
    {
        System.out.println("Name    :   "+this.name);
        System.out.println("Empid   :   "+this.empid);
        System.out.println("Department  :   "+this.department);
        System.out.println("Designation :   "+this.designation);
        System.out.println("JoinDate    :   "+this.joinDate);
        System.out.println("Salary  :   "+this.salary);
    }
    public String toString()
    {
        //return this.name+" "+this.empid+" "+this.department+" "+this.designation+" "+this.joinDate+" "+this.salary;
        //return this.name+"  "+this.empid+"  "+this.salary;
        return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
    }
}
public class Program 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Abc",10,"Sales","Manager","12/3/2015",75000.50f);
        System.out.println(emp.toString());
    } 
}