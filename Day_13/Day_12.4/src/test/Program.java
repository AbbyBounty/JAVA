package test;

import java.io.IOException;

public class Program {
	public static void print( )
	{
		try{
			for( int count = 1; count <= 10; ++ count ){
				System.out.println("Count	:	"+count);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void display( ) throws InterruptedException{
		for( int count = 1; count <= 10; ++ count ){
			System.out.println("Count	:	"+count);
			Thread.sleep(100);
		}
	}
	//public static void show( int number ) throws IOException, ClassNotFoundException, InterruptedException
	public static void show( int number ) throws Exception
	{
		if( number < 0 )
			throw new IOException();
		if( number == 0 )
			throw new ClassNotFoundException();
		if ( number > 100 )
			throw new InterruptedException();
		System.out.println(number);
	}
	public static void main(String[] args) 
	{
		try {
			Program.display();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
