package priority_queue;

public class Entry<K,V> {
	private K k;
	private V v;
	
	public Entry(K key, V value) {
		k = key;
		v = value;
	}
	
	public K getKey() { return k; }
	public V getValue() { return v; }
	public String toString() { return "[" + k + "; " + v + "]"; }
}