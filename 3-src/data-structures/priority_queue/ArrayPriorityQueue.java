package priority_queue;

import list.ArrayList;
import list.List;

public class ArrayPriorityQueue<E extends Comparable<? super E>> implements PriorityQueue<E> {
	
	private List<E> list = new ArrayList<>();
	public int size() { return list.size(); }
	public boolean isEmpty() { return size() == 0; }
	
	public void insert(E e) {
		if(isEmpty()) list.add(0, e);
		else {
			int j = 0;
			while(j < size() && e.compareTo(list.get(j)) < 0)
				j++;
			list.add(j, e);
		}
	}

	public E min() {
		if (isEmpty()) return null;
		return list.get(size() - 1);
	}

	public E removeMin() {
		if (isEmpty()) return null;
		return list.remove(size() - 1);
	}

	public String toString() {
		return list.toString();
	}
}