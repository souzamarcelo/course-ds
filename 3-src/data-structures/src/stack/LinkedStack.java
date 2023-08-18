package stack;

import base.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E> {
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	public LinkedStack() { }
	public int size() { return list.size(); }
	public boolean isEmpty() { return list.isEmpty(); }
	public void push(E element) { list.addFirst(element); }
	public E top() { return list.first(); }
	public E pop() { return list.removeFirst(); }
	public String toString() { return list.toString(); }
}
