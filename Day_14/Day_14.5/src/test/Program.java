package test;

import java.text.SimpleDateFormat;
import java.util.Date;


//class Box<T> : parameterized type

class Box<T>	//T -> Type Parameter 
{
	private T object;
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
}
public class Program {	
	public static void printDate( Date date ){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		String strDate =  sdf.format(date);
		System.out.println(strDate);
	}
	public static void main1(String[] args) {
		Box<Date> b1 = new Box<Date>();	//Date -> Type Argument
		b1.setObject(new Date());
		Date date = b1.getObject(); 
		Program.printDate(date);
	}
	public static void main2(String[] args) {
		Box<String> b1 = new Box<String>();	
		b1.setObject("SunBeam");
		String str = b1.getObject();
		System.out.println(str);
	}
	public static void main3(String[] args) {
		Box<String> b1 = new Box<>();	
		b1.setObject("SunBeam");
		String str = b1.getObject(); 
		System.out.println(str);
	}
	public static void main4(String[] args) {
		Box b1 = new Box();	//Box -> Raw Type
		//Box<Object> b1 = new Box<>();	//Box -> Raw Type
	}
	public static void main(String[] args) {
		int num1 = 10;
		//Box<int> b1 = new Box<>();	//Not Ok
		Box<Integer> b1 = new Box<>();
		b1.setObject(num1);
		int num2 = b1.getObject();
		System.out.println(num2);
	}
}
