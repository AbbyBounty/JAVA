package test;

import java.util.Date;

class Box<T extends Number>	//T -> Bounded Type Parameter 
{
	private T object;
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
}
public class Program {	
	public static void main(String[] args) {
		Box<Number> b1 = new Box<>();
		
		Box<Integer> b2 = new Box<>();
		
		Box<Double> b3 = new Box<>();
		
		Box<Boolean> b4 = new Box<>();	//Not OK
		
		Box<String> b5 = new Box<>();	//Not OK
		
		Box<Date> b6 = new Box<>();	//Not OK
	}
}
