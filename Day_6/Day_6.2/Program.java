import java.util.Scanner;

class Account
{
    private String name;
    private int number;
    private float balance;
    Account( )
    {   }
    public String getName( )
    {
        return this.name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public int getNumber() 
    {
        return this.number;
    }
    public void setNumber(int number) 
    {
        this.number = number;
    }
    public float getBalance() 
    {
        return this.balance;
    }
    public void setBalance(float balance) 
    {
        this.balance = balance;
    }
}
class Program
{
    public static void main(String[] args) 
    {
        Account acc = new Account();

        Scanner sc = new Scanner(System.in);
        System.out.print("Name  :   ");
        acc.setName( sc.nextLine() );
        System.out.print("Number  :   ");
        acc.setNumber( sc.nextInt() );
        System.out.print("Balance  :   ");
        acc.setBalance( sc.nextFloat() );

        System.out.println("Name    :   "+acc.getName());
        System.out.println("Number  :   "+acc.getNumber());
        System.out.println("Balance :   "+acc.getBalance());
    }
}