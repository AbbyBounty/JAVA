package test;

import java.text.SimpleDateFormat;
import java.util.Date;

class Box
{
	private Object object;
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
public class Program {
	
	public static void printDate( Date date ){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		String strDate =  sdf.format(date);
		System.out.println(strDate);
	}
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObject( new Date() );	//Upcasting
		String str = (String) b1.getObject(); //ClassCastException
		System.out.println(str);
	}
	public static void main3(String[] args) {
		Box b1 = new Box();
		b1.setObject( new Date() );	//Upcasting
		Date date =  (Date) b1.getObject();
		Program.printDate(date);	//Downcasting
	}
	public static void main2(String[] args) {
		int num1 = 10;
		Box b1 = new Box();
		b1.setObject(num1);	//b1.setObject(Integer.valueOf(num1));
		Integer n1 =  (Integer) b1.getObject();	//Downcasting
		int num2 = n1;	//Auto-UnBoxing
		System.out.println(num2);
	}
	public static void main1(String[] args) {
		Box b1 = new Box();
	}
}
