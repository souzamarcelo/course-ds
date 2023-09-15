package search.sequential;

import java.util.Comparator;

import list.List;

public class GenericSequentialSearch<E> {
	
	Comparator<E> comp;
	
	public GenericSequentialSearch() {
		this(new DefaultComparator<E>());
	}
	
	public GenericSequentialSearch(Comparator<E> c) {
		comp = c;
	}
	
	public int indexOf(E[] array, E value) {
		for(int i = 0; i < array.length; i++)
			if(comp.compare(array[i], value) == 0) {
				return i;
			}
		
		return -1;
	}
	
	public int indexOf(List<E> list, E value) {
		for(int i = 0; i < list.size(); i++)
			if(comp.compare(list.get(i), value) == 0) {
				return i;
			}
		
		return -1;
	}

	public int indexOf_sorted(List<E> list, E value) {
		for(int i = 0; i < list.size(); i++) {
			if(comp.compare(list.get(i), value) == 0) 
				return i;
			if(comp.compare(list.get(i), value) < 0)
				return -1; 
		}
		
		return -1;
	}
}
