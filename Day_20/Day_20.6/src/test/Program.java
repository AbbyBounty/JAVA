package test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Program 
{
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		
		
		set.add(null);
		
		for( Integer element : set )
			System.out.println(element);
	}	
}
