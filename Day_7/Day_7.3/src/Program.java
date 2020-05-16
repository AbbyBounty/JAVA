import java.util.Scanner;
/*class Math 
{
    final double PI;
    Math( )
    {
        PI = 3.14;  //OK
    }
}*/

/* class Math 
{
    final double PI = 3.14; //OK
    Math( )
    {
        //PI = 3.14;
    }
} */
class Math 
{
    final double PI = 3.14; //OK
    Math( )
    {
        PI = 3.14;  //Not OK
    }
}
class Program
{
    public static void main(String[] args) 
    {
        
    }
}