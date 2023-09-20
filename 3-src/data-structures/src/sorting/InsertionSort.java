package sorting;

import java.util.Comparator;

import list.List;

public class InsertionSort<E> {
    Comparator<E> comp;
	
	public InsertionSort() {
		this(new DefaultComparator<E>());
	}
	
	public InsertionSort(Comparator<E> c) {
		comp = c;
	}
   
    public void insertionSort(E[] array) {
        for (int i = 1; i < array.length; i++)
            insertInOrder(array[i], array, 0, i - 1);
    }

    private void insertInOrder(E element, E[] array, int begin, int end) {
        int index = end;  
        while ((index >= begin) && (comp.compare(element, array[index]) < 0)) {
            array[index + 1] = array[index];
            index--;
        }
        array[index + 1] = element;
    }

    public void insertionSort(List<E> list) {
        for (int i = 1; i < list.size(); i++)
            insertInOrder(list.get(i), list, 0, i - 1);
    }

    private void insertInOrder(E element, List<E> list, int begin, int end) {
        int index = end;  
        while ((index >= begin) && (comp.compare(element, list.get(index)) < 0)) {
            list.set(index + 1, list.get(index));
            index--;
        }
        list.set(index + 1, element);
    }
}
