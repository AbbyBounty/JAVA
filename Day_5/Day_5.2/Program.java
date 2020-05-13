import java.io.Console;
import java.util.Scanner;

class Complex
{
    int real;
    int imag;
    Complex( ) 
    {
        //Constructor chaining
        this( 0, 0 ); //Explict Call to the parameterized constructor
    }
    Complex( int real, int imag ) 
    {
        this.real = real;
        this.imag = imag;
    }
    void acceptRecord( )
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("Real Number   :   ");
        this.real = sc.nextInt();
        System.out.print("Imag Number   :   ");
        this.imag = sc.nextInt();
    }
    void printRecord( )
    {     
        System.out.println("Real Number :   "+this.real);
        System.out.println("Imag Number :   "+this.imag);
    }
}
class Program
{
    public static void main(String[] args) 
    {
        Complex c1 = new Complex(10,20);    
        Complex c2 = new Complex(30,40);
        Complex c3 = new Complex(50,60);

        c1.printRecord();
        c2.printRecord();
        c3.printRecord();
    }
    public static void main2(String[] args) 
    {
        Complex c1 = new Complex();
        c1.acceptRecord();  //c1.acceptRecord(c1);
        c1.printRecord();   //c1.printRecord(c1);
    }
    public static void main1(String[] args) 
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("Name  :   ");
        String name = sc.nextLine();
        System.out.print("Number  :   ");
        int number = sc.nextInt();
        System.out.print("Marks  :   ");
        float marks = sc.nextFloat();
        System.out.printf("%-15s%-5d%-5.2f\n", name, number, marks);

    }
}