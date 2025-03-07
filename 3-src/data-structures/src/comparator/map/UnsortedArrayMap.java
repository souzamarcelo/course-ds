package comparator.map;

import list.ArrayList;

public class UnsortedArrayMap<K,V> implements Map<K,V> {

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
	
	private ArrayList<Entry<K,V>> data = new ArrayList<>();

	public int size() { return data.size(); }
	public boolean isEmpty() { return size() == 0; }
	
	private int findIndex(K key) {
		int n = data.size();
		for (int j=0; j < n; j++)
			if (data.get(j).getKey().equals(key))
				return j;
		return -1;
	}

	public V get(K key) {
		int j = findIndex(key);
		if (j == -1) return null;
		return data.get(j).getValue();
	}

	public V put(K key, V value) {
		int j = findIndex(key);
		if (j == -1) {
			data.add(new Entry<>(key, value));
			return null;
		} else
			return data.get(j).setValue(value);
	}

	public V remove(K key) {
		int j = findIndex(key);
		if (j == -1) return null;
		V answer = data.get(j).getValue();
		int n = size();
		if (j != n - 1)
			data.set(j, data.get(n-1));
		data.remove(n-1);
		return answer;
	}
	
	public String toString() {
		return data.toString();
	}
}