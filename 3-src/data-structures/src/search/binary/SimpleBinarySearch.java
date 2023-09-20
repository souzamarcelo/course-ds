package search.binary;

import list.List;

public class SimpleBinarySearch {
	
	public int indexOf(int[] array, int value) {
		int start = 0;
		int end = array.length - 1;
		int mid;
		
		do {
			mid = (start + end) / 2;
			if(array[mid] < value)
				start = mid + 1;
			else
				end = mid - 1;
			
		} while(array[mid] != value && start <= end);
		
		if(array[mid] == value)
			return mid;
		else
			return -1;
	}
	
	public int indexOf(String[] array, String value) {
		int start = 0;
		int end = array.length - 1;
		int mid;
		
		do {
			mid = (start + end) / 2;
			if(array[mid].compareTo(value) < 0)
				start = mid + 1;
			else
				end = mid - 1;
			
		} while(array[mid].compareTo(value) != 0 && start <= end);
		
		if(array[mid].compareTo(value) == 0)
			return mid;
		else
			return -1;
	}

	public int indexOf(List<Integer> list, int value) {
		int start = 0;
		int end = list.size() - 1;
		int mid;
		
		do {
			mid = (start + end) / 2;
			if(list.get(mid) < value)
				start = mid + 1;
			else
				end = mid - 1;
			
		} while(list.get(mid) != value && start <= end);
		
		if(list.get(mid) == value)
			return mid;
		else
			return -1;
	}

	public int indexOf(List<String> list, String value) {
		int start = 0;
		int end = list.size() - 1;
		int mid;
		
		do {
			mid = (start + end) / 2;
			if(list.get(mid).compareTo(value) < 0)
				start = mid + 1;
			else
				end = mid - 1;
			
		} while(list.get(mid).compareTo(value) != 0 && start <= end);
		
		if(list.get(mid).compareTo(value) == 0)
			return mid;
		else
			return -1;
	}
}
