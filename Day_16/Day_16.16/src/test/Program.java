package test;
interface Printable{
	void print();
}
public class Program
{
	public static void main(String[] args) {
		//Program$1.class
		Printable p1 = new Printable() {
			@Override
			public void print() {
				System.out.println("Hello");
			}
		};
		p1.print();
		
		//Program$2.class
		Printable p2 = new Printable() {
			@Override
			public void print() {
				System.out.println("Hello");
			}
		};
		p2.print();
	}
}
