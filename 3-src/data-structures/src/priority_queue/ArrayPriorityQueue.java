package priority_queue;

import list.ArrayList;
import list.List;

public class ArrayPriorityQueue<K extends Comparable<? super K>,V> implements PriorityQueue<K, V> {
	
	private List<Entry<K,V>> list = new ArrayList<>();
	public int size() { return list.size(); }
	public boolean isEmpty() { return size() == 0; }
	
	private boolean checkKey(K key) {
		try {
			return (key.compareTo(key)) == 0;
		} catch(ClassCastException e) {
			throw new IllegalArgumentException("Incompatible key");
		}
	}
	
	public Entry<K, V> insert(K key, V value) {
		checkKey(key);
		Entry<K,V> newest = new Entry<>(key, value);
		if(isEmpty()) list.add(0, newest);
		else {
			int j = 0;
			while(j < size() && newest.getKey().compareTo(list.get(j).getKey()) < 0)
				j++;
			list.add(j, newest);
		}
		return newest;
	}

	public Entry<K,V> min() {
		if (isEmpty()) return null;
		return list.get(size() - 1);
	}

	public Entry<K,V> removeMin() {
		if (isEmpty()) return null;
		return list.remove(size() - 1);
	}

	public String toString() {
		return list.toString();
	}
}