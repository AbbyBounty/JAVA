package test;

class Complex{
	public void print() {
		System.out.println("Complex.print");
	}
}
public class Program {

	public static void main(String[] args) {
		Complex[] arr = new Complex[ 3 ];
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Complex();
		
		for( Complex c : arr )
			c.print();
	}
	public static void main2(String[] args) {
		Complex[] arr = new Complex[ 3 ];
		for( Complex c : arr )
			c.print();
	}
	public static void main1(String[] args) {
		boolean[] arr = new boolean[ 3 ];
		for( boolean b : arr )
			System.out.println(b);
		
	}
}
