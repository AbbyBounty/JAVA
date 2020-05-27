package test;

import java.util.Scanner;
class Test implements AutoCloseable
{
	public Test() {
		System.out.println("Inside constructor of "+this.getClass().getSimpleName());
	}
	@Override
	public void close() throws Exception {
		System.out.println("Inside close() method of "+this.getClass().getSimpleName());
	}
}
public class Program {
	public static void main(String[] args) {
		try( Test t = new Test();
			 Scanner sc = new Scanner(System.in);){
			//TODO
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		//try( Program p = new Program())	//NOT OK
		try( Test t = new Test()){
			//TODO
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try( Scanner sc = new Scanner(System.in))//try with resource
		{
			System.out.print("Name	:	");
			String name = sc.nextLine();
			System.out.println("Good morning,"+name);
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);
			//TODO
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
		finally {
			if( sc != null )
				sc.close();
		}
	}
}
