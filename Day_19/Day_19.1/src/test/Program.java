package test;

class TickTock{
	public void tick( boolean running) throws InterruptedException {
		synchronized( this ) {
			if( !running )
			{
				this.notify();
				return;
			}
			System.out.print("Tick	");
			this.notify();
			this.wait();
		}
	}
	public void tock( boolean running ) throws InterruptedException {
		synchronized( this ) {
			if( !running )
			{
				this.notify();
				return;
			}
			System.out.println("	Tock");
			this.notify();
			this.wait();
		}
	}
}
class CThread implements Runnable{
	Thread thread;
	public CThread(String name) {
		this.thread = new Thread(this, name);
		this.thread.start();
	}
	private static TickTock tt = new TickTock();
	@Override
	public void run() {
		try {
			if( Thread.currentThread().getName().equals("TickThread")) {
				for( int count = 1; count <= 5; ++ count ) {
					tt.tick( true );
					Thread.sleep(300);
				}
				tt.tick( false );
			}
			else {
				for( int count = 1; count <= 5; ++ count ) {
					tt.tock( true );
					Thread.sleep(300);
				}
				tt.tock( false );
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
public class Program {
	public static void main(String[] args)throws Exception {
		CThread th1 = new CThread("TickThread");
		CThread th2 = new CThread("TockThread");
		/*while( true ) {
			System.out.println(th1.thread.getName()+"	"+th1.thread.getState().name());
			System.out.println(th2.thread.getName()+"	"+th2.thread.getState().name());
			Thread.sleep(100);
		}*/
	}
}
