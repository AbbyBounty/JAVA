class Program
{
    public static void main( String[] args )
    {
        String str = "10.5f";
        float number = (float)Double.parseDouble(str);
        System.out.println("Number  :   "+number);
    }
    public static void main11( String[] args )
    {
        String str = "abc";
        int number = Integer.parseInt( str );
        System.out.println("Number  :   "+number);
    }
    public static void main10( String[] args )
    {
        int num1 = 10;
        String strNumber = String.valueOf(num1);  //Boxing
        System.out.println("Number  :   "+strNumber);

        float num2 = 20.2f;
        strNumber = String.valueOf(num2);  //Boxing
        System.out.println("Number  :   "+strNumber);

        double num3 = 30.3f;
        strNumber = String.valueOf(num3);  //Boxing
        System.out.println("Number  :   "+strNumber);
    }
    public static void main9( String[] args )
    {
        double number = 3.14d;
        String strNumber = Double.toString(number);//Boxing
        System.out.println("Number  :   "+strNumber);
    }
    public static void main8( String[] args )
    {
        float number = 3.14f;
        String strNumber = Float.toString(number);//Boxing
        System.out.println("Number  :   "+strNumber);
    }
    public static void main7( String[] args )
    {
        int number = 125;
        String strNumber = Integer.toString(number); //Boxing
        System.out.println("Number  :   "+strNumber);
    }
    public static void main6( String[] args )
    {
        String str = "125";
        int number = Integer.parseInt( str );//UnBoxing
        System.out.println("Number  :   "+number);
    }
    public static void main5( String[] args )
    {
        int num1 = Integer.parseInt( args[ 0 ] );
        float num2 = Float.parseFloat( args[ 1 ] );
        double num3 = Double.parseDouble( args[ 2 ] );
        double result = num1 + num2 + num3;
        System.out.println("Result  :   "+result);   
    }
    public static void main4( String[] args )
    {
        int num1 = 10;
        float num2 = 20.1f;
        double num3 = 30.2;
        double result = num1 + num2 + num3;
        System.out.println("Result  :   "+result);   
    }
    public static void main3(String[] args) 
    {
        double num1 = 10.5;
        //int num2 = num1;    //Not OK
        int num2 = (int)num1;    //OK: Narrowing
        System.out.println("Num1    :   "+num1);
        System.out.println("Num2    :   "+num2);
    }
    public static void main2(String[] args) 
    {
        int num1 = 10;
        //double num2 = ( double )num1;   //OK : Widening
        double num2 = num1;   //OK : Widening

        System.out.println("Num1    :   "+num1);
        System.out.println("Num2    :   "+num2);
    }
    public static void main1(String[] args) 
    {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println("Result  :   "+result); //OK
    }
}