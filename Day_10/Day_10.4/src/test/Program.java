package test;

import java.util.Scanner;
import static java.lang.System.out;
public class Program {
	//int printf(const char* format, ...);
	private static void sum(  int... arr )	//Varargs / variable arity function
	{
		int result = 0;
		for( int element : arr )
			result = result + element;
		System.out.println("Result	:	"+result);
	}
	public static void main1(String[] args) {
		sum( );
		sum( 10 );
		sum( 10, 20 );
		sum( 10, 20, 30 );
		sum( 10, 20, 30, 40 );
		sum( 10, 20, 30 , 40, 50 );
	}
	public static void main(String[] args) {
		out.printf("Hello World\n");
		int number = 10;
		out.printf("Number	:	%d\n",number);
		
	}
}
