package test;

import java.text.SimpleDateFormat;
import java.util.Date;

interface Dictionary<K,V>{
	K getKey();
	V getValue( );
}
class HashTable<K, V> implements Dictionary<K,V>
{
	private K key;
	private V value;
	public HashTable( K key, V value )
	{
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
}
public class Program {	
	public static void main(String[] args) {
		HashTable<Integer, String> ht = new HashTable<>(1, "Rahul");
		int key = ht.getKey();
		String value =  ht.getValue();
		System.out.println(key+"	:	"+value);
	}
}
