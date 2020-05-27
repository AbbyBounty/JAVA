package test;

import java.util.Scanner;

//AutoCloseable : I/F declared in java.lang package
//Closeable : I/F declared in java.io package
//class Test => Resource Type
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
	//Resource is java instance which holds OS resource
	public static void main(String[] args) {
		Test t = new Test( );	//new Test( ); => resource
	}
}
