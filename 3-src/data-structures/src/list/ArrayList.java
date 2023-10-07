package list;

public class ArrayList<E> implements List<E> {
	public static final int CAPACITY=16;
	private E[] data;
	private int size = 0;
	
	public ArrayList() { this(CAPACITY); }
	
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	
	public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}
	
	public E set(int i, E e) {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}
	
	public void add(int i, E e) {
		checkIndex(i, size + 1);
		if (size == data.length)
			resize(2 * data.length);
		for (int k = size-1; k >= i; k--)
			data[k+1] = data[k];
		data[i] = e;
		size++;
	}
	
	public void add(E e) {
		add(size, e);
	}
	
	public E remove(int i) {
		checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}
	
	protected void checkIndex(int i, int n) {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
	
	@SuppressWarnings("unchecked")
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k = 0; k < size; k++)
			temp[k] = data[k];
		data = temp;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		for (int j = 0; j < size; j++) {
			if (j > 0) sb.append(", ");
			sb.append(data[j]);
		}
		sb.append(")");
		return sb.toString();
	}

	public int indexOf(E e) {
		for(int i = 0; i < data.length; i++)
			if(data[i].equals(e))
				return i;
		return -1;
	}
}
