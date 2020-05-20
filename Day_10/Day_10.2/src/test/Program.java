package test;

import java.util.Calendar;

public class Program {
	
	private static void swap(Date[] arr) {
		Date temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	public static void main(String[] args) {
		Date dt1 = new Date( 4,7,1998);
		Date dt2 = new Date( 10,5,2019);
		
		Date[] arr = { dt1, dt2 };
		Program.swap(arr);
		dt1 = arr[ 0 ]; dt2 = arr[ 1 ];
		
		System.out.println(dt1);
		System.out.println(dt2);
	}
	private static void swap(Date dt1, Date dt2) {
		Date temp = dt1;
		dt1 = dt2;
		dt2 = temp;
	}
	public static void main2(String[] args) {
		Date dt1 = new Date( 4,7,1998);
		Date dt2 = new Date( 10,5,2019);
		Program.swap(dt1, dt2);
		System.out.println(dt1);
		System.out.println(dt2);
	}
	public static void main1(String[] args) {
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DATE);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println(day+"/"+month+"/"+year);
	}
}
