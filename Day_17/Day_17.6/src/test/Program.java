package test;

class CThread extends Thread{
	public CThread(String name ) {
		//super( name );
		this.setName(name);
		this.start();
	}
	@Override
	public void run() {
		//TODO : B.L
	}
}
public class Program 
{
	public static void main(String[] args) throws Exception 
	{	
		CThread th1 = new CThread("A");
		CThread th2 = new CThread("B");
		CThread th3 = new CThread("C");
		
	}
}