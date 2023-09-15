package search.sequential;

import java.util.Comparator;

import list.List;

public class GenericSequentialEntrySearch<K, V> {
	
	Comparator<K> comp;
	
	public GenericSequentialEntrySearch() {
		this(new DefaultComparator<K>());
	}
	
	public GenericSequentialEntrySearch(Comparator<K> c) {
		comp = c;
	}
	
	public V searchElement(List<Entry<K,V>> list, K key) {
		for(int i = 0; i < list.size(); i++) {
			if(comp.compare(list.get(i).getKey(), key) == 0) {
				return list.get(i).getValue();
			}
		}
		return null;
	}
}
