package list;

import base.DoublyLinkedList;

public class LinkedList<E> implements List<E> {
	DoublyLinkedList<E> list = new DoublyLinkedList<>();
	public int size() { return list.size(); }
	public boolean isEmpty() { return list.isEmpty(); }
	public String toString() { return list.toString(); }
	public E get(int i) { return list.get(i); }
	public E set(int i, E e) { return list.set(i, e); }
	public void add(int i, E e) { list.add(i, e); }
	public E remove(int i) { return list.remove(i); }
	public int indexOf(E e) { return list.indexOf(e); }
}