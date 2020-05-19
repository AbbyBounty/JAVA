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
	public static void main4(String[] args) 
	{
		int[][] arr = new int[ 3 ][  ];
		arr[ 0 ] = new int[  ] { 2,3,1};
		arr[ 1 ] = new int[  ] {4,5};
		arr[ 2 ] = new int[  ] {9,8,7,6};
		Program.printArray(arr);
	}
	public static void main(String[] args) 
	{
		int[][] arr = new int[ 3 ][  ];
		arr[ 0 ] = new int[  ] { 2,3,1};
		arr[ 1 ] = new int[  ] {4,5};
		arr[ 2 ] = new int[  ] {9,8,7,6};
		for( int index = 0; index < arr.length; ++ index )
			Arrays.sort( arr[ index ] );
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(Arrays.toString(arr[ index ] ) );
	}
	public static void main2(String[] args) 
	{
		int[][] arr = new int[ 3 ][  ];
		arr[ 0 ] = new int[ 3 ];
		arr[ 1 ] = new int[ 2 ];
		arr[ 2 ] = new int[ 4 ];
		Program.acceptRecord( arr );
		Program.printRecord( arr );
	}
	public static void main1(String[] args) 
	{
		int[][] arr = new int[ 3 ][  ];
		arr[ 0 ] = new int[ 3 ];
		arr[ 1 ] = new int[ 2 ];
		arr[ 2 ] = new int[ 4 ];
	}
}