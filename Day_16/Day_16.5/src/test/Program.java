package test;

import java.util.Iterator;
class LinkedList implements Iterable<Integer>{
	
	static class Node{
		int data;
		Node next = null;
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node head = null;
	private Node tail = null;
	public boolean empty() {
		return this.head == null;
	}
	public void addLast( int data ) {
		Node newNode = new Node( data );
		if( this.empty() ) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			this.tail.next = newNode;
			this.tail = newNode;
		}	
	}
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> itr = new LinkedListIterator( this.head );	//Upcasting
		return itr;
	}
	//Inner class
	class LinkedListIterator implements Iterator<Integer>{
		private Node node;
		public LinkedListIterator(Node head) {
			this.node = head;
		}
		@Override
		public boolean hasNext() {
			return this.node != null;
		}
		@Override
		public Integer next() {
			int data = this.node.data;
			this.node = this.node.next;
			return data;
		}
	}
}
public class Program {
	public static void main(String[] args) {
		LinkedList list  = new LinkedList();
		list.addLast( 10 );
		list.addLast( 20 );
		list.addLast( 30 );
	
		for( int element : list )
			System.out.println(element);
	}
	public static void main1(String[] args) {
		LinkedList list  = new LinkedList();
		list.addLast( 10 );
		list.addLast( 20 );
		list.addLast( 30 );
	
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
	}
}
