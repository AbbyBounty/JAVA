package test;

import java.time.LocalDate;
import java.util.Calendar;

class Date{
	private int day;
	private int month;
	private int year;
	/*public Date() {
		Calendar c = Calendar.getInstance();
		this.day = c.get(Calendar.DATE);
		this.month = c.get(Calendar.MONTH) + 1;
		this.year = c.get(Calendar.YEAR);
	}*/
	/*public Date() {
		java.util.Date dt = new java.util.Date();
		this.day = dt.getDate();
		this.month = dt.getMonth() + 1;
		this.year = dt.getYear() + 1900;
	}*/
	public Date() {
		LocalDate ld =  LocalDate.now();
		this.day = ld.getDayOfMonth();
		this.month = ld.getMonthValue();
		this.year = ld.getYear();
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return String.format("%d / %d / %d", this.day, this.month, this.year);
	}
}
public class Program {
	public static void main(String[] args) {
		Date dt1 = new Date(27,5,2020);
		Date dt2 = dt1;	//Shallow Copy of references.
	}
}
