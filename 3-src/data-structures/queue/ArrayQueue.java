package queue;

public class ArrayQueue<E> implements Queue<E> {
	public static final int CAPACITY = 1000;
	private E[] data;
	private int f = 0;
	private int size = 0;
	
	public ArrayQueue() {this(CAPACITY);}
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public int size() { return size; }
	public boolean isEmpty() { return (size == 0); }
	
	public void enqueue(E e) {
		if (size == data.length) 
			throw new IllegalStateException("Queue is full");
		
		int avail = f + size;
		if(avail >= data.length)
			avail -= data.length;
		
		data[avail] = e;
		size++;
	}
	
	public E first() {
		if (isEmpty()) return null;
		return data[f];
	}
	
	public E dequeue() {
		if (isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		
		f = f + 1;
		if(f >= data.length)
			f = 0;
		
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
