class Complex
{
    int real;   //0
    int imag;   //0
    Date dt;    //null
    void printRecord( )
    {
        System.out.println("Complex.printRecord");
    }
}
class Program
{
    public static void main(String[] args) 
    {
        Complex c1 = null; //c1 is null object
        c1.printRecord( );//NullPointerException
    }
    public static void main2(String[] args) 
    {
        Complex c1 = new Complex();
        c1.printRecord( );
    }
    public static void main1(String[] args) 
    {
        Complex c1;
        c1 = new Complex();
        c1.printRecord( );
    }
}