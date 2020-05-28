package test;

public class Program
{
	public static void main(String[] args) {
		//Object obj;
		//new Object();
		//Object obj = new Object();
		Object obj = new Object()	//Program$1.class 
		{
			private String message = "Inside method local anonymous inner class";
			@Override
			public String toString() {
				return this.message;
			}
		};
		String str =  obj.toString();
		System.out.println(str);
	}
}
