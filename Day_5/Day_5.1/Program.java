import java.io.Console;
class Complex
{
    int real;
    int imag;
    //Complex this = c1
    Complex( )  //Constructor / ctor 
    {
        this.real = 10;
        this.imag = 20;
    }
    //Complex this = c1
    Complex( int real, int imag )  //Constructor / ctor 
    {
        this.real = real;
        this.imag = imag;
    }
    //Complex this = c1
    void acceptRecord( )
    {
        Console cin = System.console();
        System.out.print("Real Number   :   ");
        this.real = Integer.parseInt(cin.readLine()); 
        System.out.print("Imag Number   :   ");
        this.imag = Integer.parseInt(cin.readLine());
    }
    //Complex this = c1
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
       Complex c1 = new Complex( 10,20  );
       c1.printRecord();    //c1.printRecord( c1 );
    }
}