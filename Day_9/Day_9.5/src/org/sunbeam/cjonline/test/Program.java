package org.sunbeam.cjonline.test;
public class Program 
{
	public static void main(String[] args) 
	{
		ComplexTest test = new ComplexTest();
		int choice;
		while( ( choice = ComplexTest.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				test.acceptRecord();
				break;
			case 2:
				test.printRecord();
				break;
			}
		}
	}
}