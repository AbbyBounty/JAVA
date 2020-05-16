import java.util.Scanner;

class Program
{
    public static void main(String[] args) 
    {
        //final int number = 10;  //OK

        //final int number;   //OK
        //number = 10;    //OK

        Scanner sc = new Scanner(System.in);
        final int number;   //OK
        System.out.print("Number    :   ");
        number = sc.nextInt();    //OK
        //number = 100; //Not OK
        System.out.println("Number  :   "+number);
    }
}