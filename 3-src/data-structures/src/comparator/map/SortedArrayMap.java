package comparator.map;

import java.util.Comparator;
import list.ArrayList;

public class SortedArrayMap<K,V> implements Map<K,V> {

	private static class Entry<K,V> {
		private K k;
		private V v;

		public Entry(K key, V value) {
			k = key;
			v = value;
		}

		public K getKey() { return k; }
		public V getValue() { return v; }

		public V setValue(V value) {
			V old = v;
			v = value;
			return old;
		}

		public String toString() { return "<" + k + ", " + v + ">"; }
	}
	
	
	private Comparator<K> comp;
	private ArrayList<Entry<K,V>> data = new ArrayList<>();

	public SortedArrayMap(Comparator<K> c) {
		comp = c;
	}

	public SortedArrayMap() {
		this(new DefaultComparator<K>());
	}
	
	public int size() { return data.size(); }
	public boolean isEmpty() { return size() == 0; }
	
	private boolean checkKey(K key) {
		try {
			return (comp.compare(key,key) == 0);
		} catch (ClassCastException e) {
			throw new IllegalArgumentException("Incompatible key");
		}
	}
	
	private int findIndex(K key) { return findIndex(key, 0, data.size() - 1); }
	
	private int findIndex(K key, int low, int high) {
		if (high < low) return high + 1;
		int mid = (low + high) / 2;
		int result = comp.compare(key, data.get(mid).getKey());
		if (result == 0)
			return mid;
		else if (result < 0)
			return findIndex(key, low, mid - 1);
		else
			return findIndex(key, mid + 1, high);
	}

	public V get(K key) {
		checkKey(key);
		int j = findIndex(key);
		if (j == size() || comp.compare(key, data.get(j).getKey()) != 0) return null;
		return data.get(j).getValue();
	}

	public V put(K key, V value) {
		checkKey(key);
		int j = findIndex(key);
		if (j < size() && comp.compare(key, data.get(j).getKey()) == 0)
			return data.get(j).setValue(value);
		data.add(j, new Entry<K,V>(key,value));
		return null;
	}

	public V remove(K key) {
		checkKey(key);
		int j = findIndex(key);
		if (j == size() || comp.compare(key, data.get(j).getKey()) != 0) return null;
		return data.remove(j).getValue();
	}

	public String toString() {
		return data.toString();
	}
}