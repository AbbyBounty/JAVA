package test;

class CThread extends Thread{
	public CThread(String name) {
		super(name);
		this.start();
	}
	@Override
	public void run() {
		this.setPriority(this.getPriority() + 2 );
		System.out.println(this.getName()+"	:	"+this.getPriority());
	}
}
public class Program {
	
	public static void main(String[] args){
		Thread thread =  Thread.currentThread();
		thread.setPriority(thread.getPriority() + 3 );
		System.out.println(thread.getName()+"	:	"+thread.getPriority());	//8
		
		Thread cThread = new CThread("User Thread");
		System.out.println(thread.getName()+"	:	"+thread.getPriority());	//8
	}
	public static void main1(String[] args){
		Thread thread =  Thread.currentThread();
		System.out.println("Priority	:	"+thread.getPriority());	//5
		
		//thread.setPriority(thread.getPriority() + 2);
		thread.setPriority(Thread.NORM_PRIORITY + 2);
		System.out.println("Priority	:	"+thread.getPriority());	//7
		
		//thread.setPriority(thread.getPriority() + 4);	//IllegalArgumentException
		thread.setPriority(thread.getPriority() - 8);	//IllegalArgumentException
		System.out.println("Priority	:	"+thread.getPriority());
		
		//IllegalArgumentException - If the priority is not in the range MIN_PRIORITY to MAX_PRIORITY.
	}
}