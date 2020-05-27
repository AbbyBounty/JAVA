package test;
interface A{
	void f1();
}
abstract class B{
	abstract void f1();
}
class C extends B implements A
{
	@Override
	public void f1() {
		System.out.println("C.f1");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new C();
		a.f1();
		
		B b = new C();
		b.f1();
	}
}
