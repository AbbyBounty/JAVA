package org.sunbeam.cjonline.test;

import org.sunbeam.cjonline.lib.Date;
import org.sunbeam.cjonline.lib.Employee;

public class Program {
	public static void main(String[] args) {
		Date date = new Date();
		date.setDay(20);
		date.setMonth(5);
		date.setYear(2020);
		System.out.println(date.toString());
		
		Employee emp = new Employee();
		System.out.println(emp.toString());
	}
}
