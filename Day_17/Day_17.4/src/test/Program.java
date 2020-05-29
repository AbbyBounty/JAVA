package test;

class CThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Inside run");
		System.out.println("Thread State	:	"+Thread.currentThread().getState().name());
	}
}
public class Program 
{
	public static void main(String[] args) throws Exception 
	{	
		Runnable target = new CThread();
		Thread th1 = new Thread(target);	//NEW
		System.out.println("Thread State	:	"+th1.getState().name());	
		th1.start();	//RUNNABLE
		//th1.start();	//IllegalThreadStateException
		
		while( true ) {
			System.out.println("Thread State	:	"+th1.getState().name());
			Thread.sleep( 100 );
		}
	}
}