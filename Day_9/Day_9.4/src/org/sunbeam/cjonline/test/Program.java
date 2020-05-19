package org.sunbeam.cjonline.test;

import java.util.Scanner;

import org.sunbeam.cjonline.complex.Complex;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord( Complex complex )
	{
		System.out.print("Real Number	:	");
		complex.setReal(sc.nextInt());
		System.out.print("Imag Number	:	");
		complex.setImag(sc.nextInt());
	}
	private static void printRecord( Complex complex )
	{
		System.out.println(complex.toString());
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		Complex complex = new Complex();
		while ( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Program.acceptRecord(complex);
				break;
			case 2:
				Program.printRecord(complex);
				break;
			}
		}
		sc.close();
	}
	public static void main4(String[] args) 
	{
		Complex complex = new Complex();
		Program.acceptRecord( complex );
		Program.printRecord( complex );
	}
	public static void main3(String[] args) 
	{
		Complex complex = new Complex();
		Scanner sc = new Scanner(System.in);
		System.out.print("Real Number	:	");
		complex.setReal(sc.nextInt());
		System.out.print("Imag Number	:	");
		complex.setImag(sc.nextInt());
		
		System.out.println(complex.toString());
	}
	public static void main2(String[] args) 
	{
		Complex complex = new Complex();
		complex.setReal(10);
		complex.setImag(20);
		
		System.out.println(complex.toString());
	}
	public static void main1(String[] args) 
	{
		Complex complex = new Complex();
		complex.setReal(10);
		complex.setImag(20);
		
		System.out.println("Real Number	:	"+complex.getReal());
		System.out.println("Imag Number	:	"+complex.getImag());
	}
}
