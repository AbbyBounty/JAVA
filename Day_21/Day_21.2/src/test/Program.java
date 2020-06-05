package test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Program {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer element = null;
		Enumeration<Integer> e = list.elements();
		while( e.hasMoreElements())
		{
			element = e.nextElement();
			System.out.println(element);
			if( element == 30 )
				list.add(40);	//OK
		}
		
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for( Integer element : list )
		{
			System.out.println(element);
			if( element == 30 )
				list.add(40); //ConcurrentModificationException
		}
		
	}
}
