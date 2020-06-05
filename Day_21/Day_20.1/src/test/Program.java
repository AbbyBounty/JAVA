package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Account /*implements Comparable<Account>*/{
	private int number;
	private String type;
	private float balance;
	public Account() {
	}
	public Account(int number, String type, float balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	/*@Override
	public int compareTo(Account other) {
		return this.number - other.number;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}
}
class Customer{
	private String name;
	private String address;
	private String email;
	public Customer() {
	}
	public Customer(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", email=" + email + "]";
	}
}
class SortByNumber implements Comparator<Account>{
	@Override
	public int compare(Account acc1, Account acc2) {
		return acc1.getNumber() - acc2.getNumber();
	}
}
class MapTest{
	private Map<Account, Customer> map;
	public void setMap(Map<Account, Customer> map) {
		this.map = map;
	}
	public void addRecord(Account[] keys, Customer[] values) {
		if( this.map != null && keys != null && values != null )
		{
			for( int index = 0; index < keys.length; ++ index )
				map.put(keys[ index ], values[ index ] );
		}
	}
	public Customer findRecord(int number ) {
		if( this.map != null )
		{
			Account key = new Account();
			key.setNumber(number);
			if( this.map.containsKey(key))
				return this.map.get(key);
		}
		return null;
	}
	public boolean removeRecord(int number ) {
		if( this.map != null )
		{
			Account key = new Account();
			key.setNumber(number);
			if( this.map.containsKey(key))
			{
				this.map.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printRecord() {
		if( this.map != null )
		{
			Set<Entry<Account, Customer>> entries = this.map.entrySet();
			for (Entry<Account, Customer> entry : entries) {
				System.out.println(entry.getKey()+"	"+entry.getValue());
			}
		}
	}
	/*public void printRecord() {
		if( this.map != null )
		{
			Set<Account> keys = this.map.keySet();
			for (Account key : keys) {
				Customer value = this.map.get(key);
				System.out.println(key.toString()+"	"+value.toString());
			}
		}
	}*/
}
public class Program {
	static Scanner sc = new Scanner(System.in);
	public static Account[] getKeys( )
	{
		Account[] arr = new Account[ 3 ];
		arr[ 0 ] = new Account(3725,"Saving",45000);
		arr[ 1 ] = new Account(2845,"Loan",80000);
		arr[ 2 ] = new Account(8071,"Pention", 50000);
		return arr;
	}
	public static Customer[] getValues( )
	{
		Customer[] arr = new Customer[ 3 ];
		arr[ 0 ] = new Customer("ABC","Pune","abc@gmail.com");
		arr[ 1 ] = new Customer("PQR","Mumbai","pqr@gmail.com");
		arr[ 2 ] = new Customer("XYZ","Delhi","xyz@gmail.com");
		return arr;
	}
	private static void acceptRecord(int[] accountNumber) {
		System.out.print("Account Number	:	");
		accountNumber[ 0 ] = sc.nextInt();
	}
	private static void printRecord(Customer value) {
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Account not found");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus )
			System.out.println("Record is removed.");
		else
			System.out.println("Record not removed.");
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Add Record");
		System.out.println("2.Find Record");
		System.out.println("3.Remove Record");
		System.out.println("4.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] accountNumber = new int[ 1 ]; 
		MapTest test = new MapTest();
		//test.setMap(new Hashtable<>());
		//test.setMap(new HashMap<>());
		//test.setMap(new LinkedHashMap<>());
		//test.setMap(new TreeMap<>( ));
		test.setMap(new TreeMap<>( new SortByNumber()));
		while( ( choice = Program.menuList(  ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Account[] keys = Program.getKeys();
				Customer[] values = Program.getValues();
				test.addRecord( keys, values );
				break;
			case 2:
				Program.acceptRecord( accountNumber );
				Customer value =  test.findRecord( accountNumber[ 0 ] );
				Program.printRecord( value );
				break;
			case 3:
				Program.acceptRecord( accountNumber );
				boolean removedStatus = test.removeRecord( accountNumber[ 0 ] );
				Program.printRecord( removedStatus );
				break;
			case 4:
				test.printRecord( );
				break;
			}
		}	
	}
}
