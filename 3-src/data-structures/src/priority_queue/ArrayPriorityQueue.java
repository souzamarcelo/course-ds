package priority_queue;

import java.util.Comparator;

import list.ArrayList;
import list.List;

public class ArrayPriorityQueue<K,V> implements PriorityQueue<K, V> {
	
	protected static class PQEntry<K,V> implements Entry<K,V> {
		private K k;
		private V v;
		
		public PQEntry(K key, V value) {
			k = key;
			v = value;
		}
		
		public K getKey() { return k; }
		public V getValue() { return v; }
		public String toString() { return "[" + k + "; " + v + "]"; }
	}
	
	private List<Entry<K,V>> list = new ArrayList<>();
	private Comparator<K> comp;
	
	
	public ArrayPriorityQueue() {
		this(new DefaultComparator<K>());
	}
	
	public ArrayPriorityQueue(Comparator<K> c) {
		comp = c;
	}

	public int size() { return list.size(); }
	public boolean isEmpty() { return size() == 0; }

	protected int compare(Entry<K,V> a, Entry<K,V> b) {
		return comp.compare(a.getKey(), b.getKey());
	}
	
	protected boolean checkKey(K key) {
		try {
			return (comp.compare(key, key)) == 0;
		} catch(ClassCastException e) {
			throw new IllegalArgumentException("Incompatible key");
		}
	}
	
	public Entry<K, V> insert(K key, V value) {
		checkKey(key);
		Entry<K,V> newest = new PQEntry<>(key, value);
		if(isEmpty()) list.add(0, newest);
		else {
			int j = 0;
			while(j < size() && compare(newest, list.get(j)) < 0)
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