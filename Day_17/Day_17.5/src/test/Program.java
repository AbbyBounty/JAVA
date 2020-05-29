package test;

class CThread implements Runnable{
	private Thread thread;
	public CThread( String name ) {
		this.thread = new Thread(this, name);
		this.thread.start();
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