package test;
class CThread implements Runnable{
	Thread thread;
	public CThread( String name ) {
		this.thread = new Thread(this, name);
		this.thread.start();
	}
	@Override
	public void run() {
		try {
			System.out.println("Starting	:	"+Thread.currentThread().getName());
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println(Thread.currentThread().getName()+"	:	"+count);
				Thread.sleep(300);
			}
			System.out.println("Terminating	:	"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
public class Program {
	
	public static void main(String[] args) throws Exception{
		CThread th1 =  new CThread("A");
		//th1.thread.join();
		CThread th2 =  new CThread("B");
		//th2.thread.join();
		CThread th3 =  new CThread("C");
		//th3.thread.join();
		CThread th4 =  new CThread("D");
		//th4.thread.join();
		CThread th5 =  new CThread("E");
		//th5.thread.join();
	}
}