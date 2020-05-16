class Test
{
    private int num1;
    private int num2;
    private static int num3;
    static
    {
        Test.num3 = 0;
    }
    public Test( )
    {
        this.num1 = 0;
        this.num2 = 0;
    }
    public void setNum1(int num1) 
    {
        this.num1 = num1;
    }
    public void setNum2(int num2)
    {
        this.num2 = num2;
    }
    public static void setNum3(int num3) 
    {
        Test.num3 = num3;
    }
    public void printRecord( )
    {
        System.out.println("Num1    :   "+this.num1);
        System.out.println("Num2    :   "+this.num2);
        System.out.println("Num3    :   "+Test.num3);
    }
    public static void f1( )
    {
        Test t1 = new Test( );  //OK
        t1.setNum1( 10 );
        t1.setNum2( 20 );
        Test.setNum3(30);
        t1.printRecord();
    }
}
class Program
{
    public static void main(String[] args) 
    {
        Test.f1();
    }
}