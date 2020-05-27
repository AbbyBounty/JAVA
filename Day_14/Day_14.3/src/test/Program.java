package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	public static void printDate( Date date )
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		String strDate =  sdf.format(date);
		System.out.println(strDate);
	}
	public static void main(String[] args) {
		Object o3 = new Date();
		String str = (String) o3;	//Downcasting
		System.out.println(str);	//ClassCastException
	}
	public static void main10(String[] args) {
		Object o2 = new Date();	//Upcasting
		Date date = (Date) o2;	//Downcasting
		Program.printDate(date);	//26/May/2020
	}
	public static void main9(String[] args) {
		Object o1 = new String("Java");	//UpCasting
		String str = (String) o1;	//Downcasting
		System.out.println(str);	//Java
	}
	public static void main8(String[] args) {
		//Date date = new Date( 120, 4, 26 );
		Date date = new Date();
		Program.printDate(date);
	}
	public static void main7(String[] args) {
		Integer n1 = new Integer(125);
		int n2 = n1;	//Auto-UnBoxing
		//int n2 = n1.intValue();	//UnBoxing
		System.out.println(n2);
	}
	public static void main6(String[] args) {
		//Object obj = null;	//OK
		//Object obj = new Object();	//OK
		//Object obj = new Program();	//Upcasting
		
		int num1 = 10;
		Object obj = num1;	//Auto Boxing
		//Object  obj =  Integer.valueOf(num1);
	}
	public static void main5(String[] args) {
		String strNumber = "125";
		int number = Integer.parseInt(strNumber);	//UnBoxing
		System.out.println(number);
	}
	public static void main4(String[] args) {
		int number = 125;
		//String strNumber = String.valueOf(number);	//Boxing
		String strNumber = Integer.toString(number);	//Boxing
		System.out.println(strNumber);
	}
	public static void main3(String[] args) {
		Number n1 = new Integer(125);	//Upcasting
		Integer n2 = (Integer) n1;	//Downcasting
	}	
	public static void main2(String[] args) {
		double num1 = 10.5;
		int num2 = (int) num1;	//Narrowing
		System.out.println("Num2	:	"+num2);
	}
	public static void main1(String[] args) {
		int num1 = 10;
		double num2 = num1;	//Widening
		System.out.println("Num2	:	"+num2);
	}
}
