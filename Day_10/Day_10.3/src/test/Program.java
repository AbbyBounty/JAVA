package test;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] number) {
		if( number != null )
		{
			System.out.print("Numebr	:	");
			number[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(int[] number) {
		if( number != null )
			System.out.println("Number	:	"+number[ 0 ] );
	}
	public static void main(String[] args) {
		int[] number = new int[ 1 ];
		Program.acceptRecord( number );
		Program.printRecord( number );
	}
}
