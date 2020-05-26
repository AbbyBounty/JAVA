package test;

import java.util.Scanner;

@SuppressWarnings("serial")
class StackOverflowException extends Exception 
{
	public StackOverflowException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class StackUnderflowException extends Exception 
{
	public StackUnderflowException(String message) {
		super(message);
	}
}
class Stack{
	private int top = -1;
	private int[] arr;
	
	public Stack(  ) {
		this( 3 );
	}
	public Stack( int size ) {
	
		this.arr = new int[ size ];
	}
	public boolean empty( )
	{
		return this.top == -1;
	}
	public boolean full( )
	{
		return this.top == this.arr.length - 1;
	}
	public void push( int element ) throws StackOverflowException
	{
		if( this.full())
			throw new StackOverflowException("Stack is full");
		this.arr[ ++ this.top ] = element;
	}
	public int peek( ) throws StackUnderflowException
	{
		if( this.empty())
			throw new StackUnderflowException("Stack is empty");
		return this.arr[ this.top ];
	}
	public void pop() throws StackUnderflowException
	{
		if( this.empty())
			throw new StackUnderflowException("Stack is empty");
		-- this.top;
	}
}
public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( int[] element )
	{
		if( element != null )
		{
			System.out.print("Enter element	:	");
			element[ 0 ] = sc.nextInt();
		}
	}
	public static void printRecord( int[] element )
	{
		if( element != null )
			System.out.println("Popped element is	:	"+element[ 0 ]);
	}
	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] element = new int[ 1 ];
		Stack stk = new Stack( );
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			try {
				switch( choice )
				{
				case 1:
					Program.acceptRecord( element );
					stk.push(element[ 0 ] );
					break;
				case 2:
					element[ 0 ] = stk.peek();
					Program.printRecord( element );
					stk.pop();
					break;
				}
			} catch (StackOverflowException | StackUnderflowException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main1(String[] args) {
		int choice;
		Stack stk = new Stack( );
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			try {
				switch( choice )
				{
				case 1:
					System.out.print("Enter element	:	");
					stk.push(sc.nextInt());
					break;
				case 2:
					System.out.println("Popped element is	:	"+stk.peek());
					stk.pop();
					break;
				}
			} catch (StackOverflowException | StackUnderflowException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
