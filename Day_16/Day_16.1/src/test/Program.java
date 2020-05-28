package test;

public class Program {

	public static void main(String[] args) {
		
		try {
			Date dt1 = new Date();
			Date dt2 = (Date)dt1.clone();		
			
			
			dt2.setDay(23);
			dt2.setMonth(7);
			dt2.setYear(2000);
			
			System.out.println(dt1.toString());
			System.out.println(dt2.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		Date dt1 = new Date();
		Date dt2 = dt1;	//Shallow Copy of references
		
		dt1.setDay(27);
		dt2.setMonth(4);
		
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());
	}
}
