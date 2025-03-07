package base;

public class DoublyLinkedList<E> {
	
	private static class Node<E> {
		private E element;
		private Node<E> prev;
		private Node<E> next;
		
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
		
		public E getElement() { return element; }
		public Node<E> getPrev() { return prev; }
		public Node<E> getNext() { return next; }
		
		public void setPrev(Node<E> p) { prev = p; }
		public void setNext(Node<E> n) { next = n; }
	}
	
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	
	public DoublyLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
	
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	
	public E first() {
		if (isEmpty()) return null;
		return header.getNext().getElement();
	}
	
	public E last() {
		if (isEmpty()) return null;
		return trailer.getPrev().getElement();
	}
	
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	public E removeFirst() {
		if (isEmpty()) return null;
		return remove(header.getNext());
	}
	
	public E removeLast() {
		if (isEmpty()) return null;
		return remove(trailer.getPrev());
	}
	
	private void addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		pred.setNext(newest);
		succ.setPrev(newest);
		size++;
	}
	
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		Node<E> walk = header.getNext();
		while (walk != trailer) {
			sb.append(walk.getElement());
			walk = walk.getNext();
			if (walk != trailer)
			sb.append(", ");
		}
		sb.append(")");
		return sb.toString();
	}
	
	//Methods to implement a linked-list with operations in the internal nodes
	
	public void add(int position, E e) {
		checkIndex(position, size + 1);
		Node<E> n = searchNode(position);
		addBetween(e, n.getPrev(), n);
	}
	
	public E get(int position) {
		checkIndex(position, size);
		return(searchNode(position).getElement());
	}
	
	public E set(int position, E e) {
		checkIndex(position, size);
		Node<E> n = searchNode(position);
		addBetween(e, n, n.getNext());
		remove(n);
		return n.getElement();
	}
	
	public E remove(int position) {
		checkIndex(position, size);
		return remove(searchNode(position));
	}
	
	protected Node<E> searchNode(int position) {
		if(position == 0) return header.getNext();
		if(position == size()) return trailer;
		
		int count = -1;
		Node<E> walk = header.getNext();
		while(walk != trailer) {
			count++;
			if(count == position)
				return walk;
			walk = walk.getNext();
		}
		return null;
	}
	
	protected void checkIndex(int i, int n) {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

	public int indexOf(E e) {
		if(isEmpty()) return -1;
		int count = -1;
		Node<E> walk = header.getNext();
		while(walk != trailer) {
			count++;
			if(walk.getElement().equals(e))
				return count;
			walk = walk.getNext();
		}
		return -1;
	}
	
	// Exercise 3.6
	private Node<E> middle(){
		if(size == 0) throw new IllegalStateException("List must be nonempty");
		Node<E> middle = header.getNext();
		Node<E> partner = trailer.getPrev();
		while(middle != partner && middle.getNext() != partner){
			middle = middle.getNext();
			partner = partner.getPrev();
		}
		return middle;
	}
	
	// Exercise 3.8
	public int size2(){
		int count = 0;
		Node<E> walk = header.getNext();
		while(walk != trailer){
			count++;
			walk = walk.getNext();
		}
		return count;
	}
}
