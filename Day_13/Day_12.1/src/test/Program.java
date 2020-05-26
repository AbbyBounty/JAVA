package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
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
		catch( ArithmeticException | InputMismatchException ex ){
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
//		catch( ArithmeticException ex ){
//			//System.out.println(ex.getMessage());
//			ex.printStackTrace();
//		}
//		catch (InputMismatchException ex) {
//			ex.printStackTrace();
//		}
	}
}
