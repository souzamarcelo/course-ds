package search.sequential;

import list.List;

public class SimpleSequentialSearch {
	
	public int search(int[] array, int value) {
		for(int i = 0; i < array.length; i++)
			if(array[i] == value)
				return i;
		
		return -1;
	}
	
	public int search_sorted(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value)
				return i;
			if(array[i] < value)
				return -1;
		}
		return -1;
	}

	public int search(String[] array, String value) {
		for(int i = 0; i < array.length; i++)
			if(array[i].equals(value))
				return i;
		
		return -1;
	}

	public int search(List<Integer> list, int value) {
		for(int i = 0; i < list.size(); i++)
			if(list.get(i) == value)
				return i;
		
		return -1;
	}

	public int search(List<String> list, String value) {
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).equals(value))
				return i;
		
		return -1;
	}
}
