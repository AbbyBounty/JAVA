package test;

import java.util.ArrayList;

public class Program {	
	private static ArrayList<Integer> getIntegerList() {
		ArrayList<Integer> list  = new ArrayList<>();
		list.add( 10 );
		list.add( 20 );
		list.add( 30 );
		return list;
	}
	private static ArrayList<Double> getDoubleList() {
		ArrayList< Double> list  = new ArrayList<>();
		list.add( 10.1 );
		list.add( 20.2 );
		list.add( 30.3 );
		return list;
	}
	private static ArrayList<String> getStringList() {
		ArrayList<String> list  = new ArrayList<>();
		list.add( "ABC" );
		list.add( "PQR" );
		list.add( "XYZ ");
		return list;
	}
	private static void print(ArrayList< ? super Integer > list){
		for( Object element : list )
			System.out.println(element);
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = Program.getIntegerList( );
		Program.print( integerList );	//OK
		
		ArrayList<Double> doubleList = Program.getDoubleList( );
		Program.print( doubleList );	//Not OK
		
		ArrayList<String> stringList = Program.getStringList( );
		Program.print( stringList );	//Not OK
	}
}
