package org.sunbeam.cjonline.test;

import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	
	private static void acceptRecord(int[][] arr) 
	{
		if( arr != null )
		{
			for( int row = 0; row < arr.length; ++ row )
			{
				for( int col = 0; col < arr[ row ].length; ++ col )
				{
					System.out.print("Element	:	");
					arr[ row ][ col ] = sc.nextInt();
				}
			}
		}
	}

	private static void printRecord(int[][] arr) 
	{
		if( arr != null )
		{
			for( int row = 0; row < arr.length; ++ row )
			{
				for( int col = 0; col < arr[ row ].length; ++ col )
				{
					System.out.print(arr[ row ][ col ]+"	");
				}
				System.out.println();
			}
		}
	}
	private static void printArray(int[][] arr) 
	{
		if( arr != null )
		{
			for( int[] ref : arr )
			{
				for( int element : ref )
				{
					System.out.print(element+"	");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) 
	{
		int[][]arr = new int[  ][  ] { {1,2,3},{4,5,6},{7,8,9}};
		Program.printArray(arr);
	}
	public static void main3(String[] args) 
	{
		//int[][]arr = new int[  ][  ] { {1,2,3},{4,5,6},{7,8,9}};
		//int[][]arr = { {1,2,3},{4,5,6},{7,8,9}};
		int[][]arr = { {3,2,1},{5,4,6},{9,8,7}};
		for( int index = 0; index < arr.length; ++ index )
			Arrays.sort( arr[ index ] );
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(Arrays.toString(arr[ index ] ) );
	}
	public static void main2(String[] args) 
	{
		int[][]arr = new int[ 2 ][ 3 ];
		Program.acceptRecord( arr );
		Program.printRecord( arr );
	}
	public static void main1(String[] args) 
	{
		//int arr[][] = null;	//OK
		//int[] arr[] = null;	//OK
		//int[][] arr = null;	//OK
		int[][]arr = new int[ 2 ][ 3 ];	//Ok
	}
}