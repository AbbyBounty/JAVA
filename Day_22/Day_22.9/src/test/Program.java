package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("F.Q. Name	:	");
			String typeName = sc.nextLine();	//java.lang.Thread
			Class<?> c = Class.forName(typeName);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		Runnable r = null;
		Class<?> c = Runnable.class;
	}
	public static void main1(String[] args) {
		Integer i1 = new Integer(0);
		Class<?> c = i1.getClass();
	}
}
