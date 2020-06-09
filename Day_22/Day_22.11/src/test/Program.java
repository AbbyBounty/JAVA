package test;

import java.lang.reflect.Field;

class Complex{
	private int real;
	private int imag;
	public Complex() {
		this.real = 10;
		this.imag = 20;
	}
	public int getReal() {
		return real;
	}
	public int getImag() {
		return imag;
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			Complex complex = new Complex();
			System.out.println("Real Number	:	"+complex.getReal());
			System.out.println("Imag Number	:	"+complex.getImag());
			
			
			Field field = null;
			Class<?> c = complex.getClass();
			
			field = c.getDeclaredField("real");
			field.setAccessible(true);
			field.setInt(complex, 50);
			
			field = c.getDeclaredField("imag");
			field.setAccessible(true);
			field.setInt(complex, 60);
			
			System.out.println("Real Number	:	"+complex.getReal());
			System.out.println("Imag Number	:	"+complex.getImag());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
