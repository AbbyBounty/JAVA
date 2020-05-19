package org.sunbeam.cjonline.test;

import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	
	
	private static void acceptRecord(int[] arr) 
	{
		if( arr != null )
		{
			for( int index = 0; index < arr.length; ++ index  )
			{
				System.out.print("Element	:	");
				arr[ index ] = sc.nextInt();
			}
		}
	}
	private static void printRecord(int[] arr)
	{
		if( arr != null )
		{
			for( int index = 0; index < arr.length; ++ index  )
				System.out.print(arr[ index ]+"	");
			System.out.println();
		}
	}
	private static void printArray(int[] arr)
	{
		if( arr != null )
		{
			for(int element : arr )
				System.out.print(element+"	");
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = new int[ ] {5,1,4,2,3,10,6,7,9};
		Program.printArray(arr);
	}
	public static void main10(String[] args) 
	{
		int[] arr = new int[ ] {5,1,4,2,3};
		System.out.println(arr.toString());	//[I@42a57993
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);	//Dual-Pivot Quicksort
		System.out.println(Arrays.toString(arr));
	}
	public static void main9(String[] args) 
	{
		int[] arr = new int[ ] {5,1,4,2,3};
		Program.printRecord(arr);
		Arrays.sort(arr);	//Dual-Pivot Quicksort
		Program.printRecord(arr);
	}
	public static void main8(String[] args) 
	{
		int[] arr = new int[ ] { 10, 20, 30, 40, 50 };
		//int element = arr[ arr.length - 1 ]; //50
		//int element = arr[ arr.length ]; //ArrayIndexOutOfBoundsException
		int element = arr[ -1 ]; //ArrayIndexOutOfBoundsException
		System.out.println(element);
		
	}
	public static void main7(String[] args) 
	{
		//int[] arr = new int[ ] { 10, 20, 30, 40, 50 };
		int[] arr =  { 10, 20, 30, 40, 50 };
		Program.printRecord(arr);
	}
	public static void main6(String[] args) 
	{
		int[] arr = null;
		arr = new int[ 3 ];
		Program.acceptRecord( arr );
		Program.printRecord( arr );
	}
	public static void main5(String[] args) 
	{
		int[] arr = new int[ 3 ];
		Program.acceptRecord( arr );
		Program.printRecord( arr );
	}
	public static void main4(String[] args) 
	{
		int[] arr = new int[ 3 ];
		for( int index = 0; index < 3; ++ index  )
		{
			System.out.print("Element	:	");
			arr[ index ] = sc.nextInt();
		}
		for( int index = 0; index < 3; ++ index  )
			System.out.println(arr[ index ]);
	}
	public static void main3(String[] args) 
	{
		int[] arr = new int[ 3 ];
		for( int index = 0; index < 3; ++ index  )
			System.out.println(arr[ index ]);
	}
	public static void main2(String[] args) 
	{
		int[] arr = new int[ 3 ];
		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);
	}
	public static void main1(String[] args) 
	{
		//int arr[ ] = null;	//OK
		//int arr[ ] = new int[ 3 ];	//OK
		//int[] arr = null;	//OK
		int[] arr = new int[ 3 ];	//OK
		//int[] arr = new int[ -3 ];	//NegativeArraySizeException
	}
}