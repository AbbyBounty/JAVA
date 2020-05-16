class Test
{
    private int num1;
    private int num2;
    private static int num3;
    //Static Initializer Block
    static
    {
        System.out.println("Inside Static Initializer Block1:Test");
        Test.num3 = 500;
    }
    public Test( int num1, int num2 )
    {
        System.out.println("public Test( int num1, int num2 )");
        this.num1 = num1;
        this.num2 = num2;
    }
    static
    {
        System.out.println("Inside Static Initializer Block2:Test");
        Test.num3 = 500;
    }
    public void printRecord( )
    {
        System.out.println("Num1    :   "+this.num1);
        System.out.println("Num2    :   "+this.num2);
        System.out.println("Num3    :   "+Test.num3);
    }
    static
    {
        System.out.println("Inside Static Initializer Block3:Test");
        Test.num3 = 500;
    }
}
class Program
{
    //Static Initializer Block
    static
    {
        System.out.println("Inside Static Initializer Block:Program");
    }
    public static void main(String[] args) 
    {
        System.out.println("Inside main method");
        Test t1 = new Test( 10,20);
        //t1.printRecord();
        Test t2 = new Test( 30,40);
        //t2.printRecord();
        Test t3 = new Test( 50,60);
        //t3.printRecord();
    }
}