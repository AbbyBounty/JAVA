package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program 
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer element = null;
		ListIterator<Integer> itr = list.listIterator(list.size());
		while( itr.hasNext())
		{
			element = itr.next();
			System.out.print(element+"	");
		}
		System.out.println();
		while( itr.hasPrevious())
		{
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
	public static void main3(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer element = null;
		ListIterator<Integer> itr = list.listIterator();
		while( itr.hasNext())
		{
			element = itr.next();
			System.out.print(element+"	");
		}
		System.out.println();
		while( itr.hasPrevious())
		{
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
	public static void main2(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for( Integer element : list )
			System.out.print(element+"	");
		
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext())
		{
			element = itr.next();
			System.out.print(element+"	");
		}
	}
}
