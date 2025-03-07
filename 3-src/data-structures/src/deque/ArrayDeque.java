package deque;

public class ArrayDeque<E> implements Deque<E> {
	public static final int CAPACITY = 1000;
	private E[] data;
	private int f = 0;
	private int size = 0;
	
	public ArrayDeque() {this(CAPACITY);}
	
	@SuppressWarnings("unchecked")
	public ArrayDeque(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public int size() { return size; }
	public boolean isEmpty() { return (size == 0); }
	
	public E first() {
		if (isEmpty()) return null;
		return data[f];
	}
	
	public E last() {
		if (isEmpty()) return null;
		int index = f + size - 1;
		if(index >= data.length)
			index -= data.length;
		return data[index];
	}

	public void addFirst(E e) {
		if (size == data.length) 
			throw new IllegalStateException("Deque is full");
		
		int avail = f - 1;
		if(avail < 0)
			avail = data.length - 1;
		
		data[avail] = e;
		f = avail;
		size++;
	}

	public void addLast(E e) {
		if (size == data.length) 
			throw new IllegalStateException("Deque is full");
		
		int avail = f + size;
		if(avail >= data.length)
			avail -= data.length;
		
		data[avail] = e;
		size++;
	}

	public E removeFirst() {
		if (isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		
		f = f + 1;
		if(f >= data.length) f = 0;
		
		size--;
		return answer;
	}
	
	public E removeLast() {
		if (isEmpty()) return null;
		int index = f + size - 1;
		if(index >= data.length) index -= data.length;
		
		E answer = data[index];
		data[index] = null;
		
		size--;
		return answer;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		int k = f;
		for (int j=0; j < size; j++) {
			if (j > 0)
				sb.append(", ");
			sb.append(data[k]);
			k = (k + 1) % data.length;
		}
		sb.append(")");
		return sb.toString();
	}
}