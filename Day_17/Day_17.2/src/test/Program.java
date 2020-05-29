package test;

public class Program 
{
	public static void main(String[] args) 
	{
		Thread thread = Thread.currentThread();
		
		String name =  thread.getName();
		System.out.println("Thread Name	:	"+name);
		
		int priority = thread.getPriority();
		System.out.println("Thread Priority	:	"+priority);
		
		String threadGroup = thread.getThreadGroup().getName();
		System.out.println("Thread Group	:	"+threadGroup);
		
		String state = thread.getState().toString();
		System.out.println("Thread State	:	"+state);
		
		boolean threadType = thread.isDaemon();
		System.out.println("Thread Type	:	"+( threadType ? "Daemon Thread" : "User Thread"));
		
		boolean threadStatus =  thread.isAlive();
		System.out.println("Thread Status	:	"+(threadStatus ? "Alive" : "Dead" ));
	}
	public static void main1(String[] args)
	{
		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());//Thread[main,5,main]
	}
}