package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Program 
{
	public static void main(String[] args) 
	{
		//Queue<Integer> que = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);
		
		Integer element = null;
		while( ! que.isEmpty( ) )
		{
			element = que.peek();
			System.out.println("Removed element is : "+element);
			que.poll();
		}
	}
	public static void main1(String[] args) 
	{
		Queue<Integer> que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		
		Integer element = null;
		while( ! que.isEmpty( ) )
		{
			element = que.element();
			System.out.println("Removed element is : "+element);
			que.remove();
		}
	}	
}

