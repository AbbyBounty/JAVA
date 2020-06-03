package test;
public class Program {
	public String str = "Hello";
	public void print( ) throws InterruptedException {
		synchronized( str ) {
			System.out.println(str);	//Hello
			//this.wait();	//IllegalMonitorStateException
			str.wait(1000);	//Ok
		}
	}
	public static void main(String[] args)throws Exception {
		Program p = new Program();
		p.print();
	}
}
