package test;


//Top Level class
class Outer		//Outer.class
{
	//Non Static Nested class	=>	Inner class
	class Inner	//Outer$Inner.class
	{
		
	}
}
public class Program {
	public static void main(String[] args) {
		Outer out  = new Outer();
		
		//Outer.Inner in = out.new Inner();
		Outer.Inner in = new Outer().new Inner();
	}
}
