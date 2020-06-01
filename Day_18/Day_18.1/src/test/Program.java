package test;
class CThread extends Thread
{
	public CThread(String name ) 
	{
		this.setName(name);
	}
	public void run()throws RuntimeException
	{
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				if( count == 5 )
					return;
					//throw new RuntimeException();
					//Thread.currentThread().interrupt();
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
public class Program {
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new CThread("A");
		System.out.println(th1.getState().name());	//NEW
		th1.start();
		
		while( th1.isAlive() )
		{
			System.out.println(th1.getState().name());	
			Thread.sleep(100);
		}
		System.out.println(th1.getState().name());
	}
}
