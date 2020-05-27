package test;
interface A		//ISI
{
	int number = 10;
	//public static final int number = 10;
	void print( );
	//public abstract void print( );
}
class B implements A	//Service provider
{
	@Override
	public void print() {
		System.out.println("Number	:	"+A.number);
	}
}
public class Program {
	public static void main(String[] args) {
		//Service Consumer
		B b = new B();
		b.print();
		
		A a = new B( );	//Upcasting
		a.print();	//DMD
		
	}
}
