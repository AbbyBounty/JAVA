package test;

class TickTock{
	public void tick( ) throws InterruptedException {
		synchronized( this ) {
			System.out.print("Tick	");
			this.notify();
			this.wait(1000);
		}
	}
	public void tock( ) throws InterruptedException {
		synchronized( this ) {
			System.out.println("	Tock");
			this.notify();
			this.wait(1000);
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
					tt.tick(  );
					Thread.sleep(300);
				}
			}
			else {
				for( int count = 1; count <= 5; ++ count ) {
					tt.tock(  );
					Thread.sleep(300);
				}
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
