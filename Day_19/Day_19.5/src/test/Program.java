package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList< >( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		
		Collection<Integer> c = new ArrayList<>();
		c.add(40);
		c.add(50);
		c.add(60);
		
		if( list.containsAll(c)) {
			//list.removeAll(c);
			list.retainAll(c);
		}
		
		for( Integer element : list )
			System.out.println(element);
		
	}
	public static void main8(String[] args) {
		
		List<Integer> list = new ArrayList< >( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Collection<Integer> newList = new ArrayList<>();
		newList.add(60);
		newList.add(70);
		newList.add(80);
		
		list.addAll(3, newList);
		
		for( Integer element : list )
			System.out.println(element);
		
	}
	public static void main7(String[] args) {
		List<Integer> list = new ArrayList< >( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer key = new Integer(30);
		if( list.contains(key)){
			//list.remove(key);
			
			int index = list.indexOf(key);
			list.remove(index);
		}
		else
			System.out.println("Key not found");
		
		
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main6(String[] args) {
		String str = "SunBeam";
		char ch = str.charAt( str.length()); //StringIndexOutOfBoundsException
	}
	public static void main5(String[] args) {
		int[] arr = new int[ ] { 1,2,3};
		int element = arr[ arr.length ]; //ArrayIndexOutOfBoundsException
	}
	public static void main4(String[] args) {
		List<Integer> list = new ArrayList< >( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer element = list.get(list.size());	//IndexOutOfBoundsException
		System.out.println(element);
	}
	public static void main3(String[] args) {
		List<Integer> list = new ArrayList< >( );
		
		int element = 10;
		for( int index = 0; index < 5; ++ index ) {
			list.add(index, element * ( index + 1 ) );
		}
		
		for (Integer ele : list) {
			System.out.println(ele);
		}
	}
	public static void main2(String[] args) {
		List<Integer> list = new ArrayList< >( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer element = null;
		for( int index = 0; index < list.size(); ++ index ) {
			element = list.get(index);
			System.out.println(element);
		}
	}
	public static void main1(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		
		List<Integer> l2 = new ArrayList<>();	//Upcasting
		
		Collection<Integer> l3 = new ArrayList<>();	//Upcasting
	}
}
