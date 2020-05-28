package test;
class Outer	{
	private int num1 = 10;
	private static int num2 = 20;
	
	class Inner{
		private int num3 = 30;
		private final static int num4 = 40;
		public void print( ) {
			System.out.println("Num1	:	"+num1);
			System.out.println("Num2	:	"+num2);
			System.out.println("Num3	:	"+this.num3);
			System.out.println("Num4	:	"+Inner.num4);
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.print();
	}
}
