package test;

import java.util.Calendar;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date() {
		Calendar c = Calendar.getInstance();
		this.day = c.get(Calendar.DATE);
		this.month = c.get(Calendar.MONTH) + 1;
		this.year = c.get(Calendar.YEAR);
	}
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("%d/%d/%d", this.day, this.month, this.year);
	}
}
