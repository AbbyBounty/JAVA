import java.io.Console;
class Program
{
    public static void main( String[] args )
    {
        Console cin = System.console();
        System.out.print("Name  :   ");
        String name = cin.readLine();
        System.out.print("Empid  :   ");
        int empid = Integer.parseInt( cin.readLine());
        System.out.print("Salary  :   ");
        float salary = Float.parseFloat( cin.readLine() );
        System.out.printf("%-15s%-5d%-10.2f\n",name, empid, salary);   
    }
    public static void main1( String[] args )
    {
        String name = "Prashant Papal";
        int empid = 12;
        float salary = 45000.50f;
        System.out.printf("%-15s%-5d%-10.2f\n",name, empid, salary);

         name = "Amit Pol";
         empid = 4;
         salary = 15000.45f;
         System.out.printf("%-15s%-5d%-10.2f\n",name, empid, salary);
    }
}