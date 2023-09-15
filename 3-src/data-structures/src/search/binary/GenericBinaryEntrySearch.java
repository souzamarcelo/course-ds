package search.binary;

import java.util.Comparator;

import list.List;

public class GenericBinaryEntrySearch<K,V> {
	
	Comparator<K> comp;
	
	public GenericBinaryEntrySearch() {
		this(new DefaultComparator<K>());
	}
	
	public GenericBinaryEntrySearch(Comparator<K> c) {
		comp = c;
	}
	
	public V searchElement(List<Entry<K,V>> list, K key) {
		int start = 0;
		int end = list.size() - 1;
		int mid;
		
		do {
			mid = (start + end) / 2;
			if(comp.compare(list.get(mid).getKey(), key) < 0)
				start = mid + 1;
			else
				end = mid - 1;
			
		} while(comp.compare(list.get(mid).getKey(), key) != 0 && start <= end);
		
		if(comp.compare(list.get(mid).getKey(), key) == 0)
			return list.get(mid).getValue();
		else
			return null;
	}
}
