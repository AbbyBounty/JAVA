package test;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			if( num2 == 0 )
				throw new ArithmeticException("Divide by zero exception");
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		
		//InterruptedException ex1 = new InterruptedException( );	//Ok
		//Exception ex2 = new InterruptedException( );	//Ok : Upcasting
		
		try{
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
		
			if( num2 == 0 )
				throw new InterruptedException("Divide by zero exception");
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
			
		}
		/*catch( InterruptedException ex ){
			System.out.println("Inside InterruptedException catch block");
		}*/
		catch( Exception ex ){
			System.out.println("Inside Exception catch block");
		}
	}
	public static void main1(String[] args) {
		
		//ArithmeticException ex1 = new ArithmeticException();	//OK
		//RuntimeException ex2 = new ArithmeticException();	//OK:Upcasting
		//Exception ex3 = new ArithmeticException();	//OK:Upcasting
		
		try{
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
		
			if( num2 == 0 )
				throw new ArithmeticException("Divide by zero exception");
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
			
		}
		/*catch( ArithmeticException ex ){
			System.out.println("Inside ArithmeticException catch block");
		}
		catch( RuntimeException ex ){
			System.out.println("Inside RuntimeException catch block");
		}*/
		catch( Exception ex ) {
			System.out.println("Inside Exception catch block");
		}
	}
}
