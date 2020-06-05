package test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program 
{
	
	public static Map<Integer, String> getMap( )
	{
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "DAC");
		map.put(2, "DMC");
		map.put(3, "DESD");
		map.put(4, "DBDA");
		map.put(5, "PREDAC");
		return map;
	}
	private static void printKeys(Map<Integer, String> map) 
	{
		if( map != null )
		{
			Set<Integer> keys = map.keySet();
			for( Integer key : keys )
				System.out.println(key);
		}
	}
	private static void printValues(Map<Integer, String> map) {
		if( map != null )
		{
			Collection<String> values = map.values();
			for (String value : values) 
				System.out.println(value);
		}
	}
	private static void printKeyValuePair(Map<Integer, String> map) {
		if( map != null )
		{
			Set<Entry<Integer, String>> entries = map.entrySet();
			for (Entry<Integer, String> entry : entries) {
				System.out.println(entry.getKey()+"	"+entry.getValue());
			}
		}
	}
	public static String find( Map<Integer, String> map, Integer key )
	{
		if( map != null )
		{
			if( map.containsKey(key))
				return map.get(key);
		}
		return null;
	}
	public static String remove( Map<Integer, String> map, Integer key )
	{
		if( map != null )
		{
			if( map.containsKey(key))
				return map.remove(key);
		}
		return null;
	}
	public static void main(String[] args) 
	{
		Map<Integer, String> map = Program.getMap();
		//Program.printKeys( map );
		//Program.printValues( map );
		//Program.printKeyValuePair( map );
		//String value = Program.find(map, 3 );
		String value = Program.remove(map, 3 );
		System.out.println(value);
	}	

	public static void main2(String[] args) 
	{
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "DAC");
		map.put(2, "DMC");
		map.put(3, "DESD");
		map.put(4, "DBDA");
		map.put(5, "PREDAC");
	}	
	public static void main1(String[] args) 
	{
		Map<Integer, String> map = new Hashtable<>();
	}	
}

