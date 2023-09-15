package search.binary;

import java.util.Comparator;

import list.List;

public class GenericBinarySearch<E> {

	Comparator<E> comp;
	
	public GenericBinarySearch() {
		this(new DefaultComparator<E>());
	}
	
	public GenericBinarySearch(Comparator<E> c) {
		comp = c;
	}
	
	public int indexOf(E[] array, E value) {
		int start = 0;
		int end = array.length - 1;
		int mid;
		
		do {
			mid = (start + end) / 2;
			if(comp.compare(array[mid], value) < 0)
				start = mid + 1;
			else
				end = mid - 1;
			
		} while(comp.compare(array[mid], value) != 0 && start <= end);
		
		if(comp.compare(array[mid], value) == 0)
			return mid;
		else
			return -1;
	}
	
	public int indexOf(List<E> list, E value) {
		int start = 0;
		int end = list.size() - 1;
		int mid;
		
		do {
			mid = (start + end) / 2;
			if(comp.compare(list.get(mid), value) < 0)
				start = mid + 1;
			else
				end = mid - 1;
			
		} while(comp.compare(list.get(mid), value) != 0 && start <= end);
		
		if(comp.compare(list.get(mid), value) == 0)
			return mid;
		else
			return -1;
	}
}
