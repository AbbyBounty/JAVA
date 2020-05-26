package test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

class Test
{
	Scanner sc;
	public Test() {
		sc  = new Scanner(System.in);
	}
	//TODO
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		sc.close();
	}
}
public class Program {
	public static void main1(String[] args) {
		Test t = new Test();
		t = null;
	}
	public static void main(String[] args) 
	{
		Scanner sc = null;
		try{
			System.out.println("Inside try");
			sc = new Scanner(System.in);
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
			System.exit(0);
		}
		catch (Exception ex) {
			System.out.println("Inside catch");
			ex.printStackTrace();
			System.exit(0);
		}
		finally{
			sc.close();
			System.out.println("Inside finally");
		}
	}
}
