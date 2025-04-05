package sorting;

public class InsertionSort {
    
	public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++)
            insertInOrder(array[i], array, 0, i - 1);
    }
	
	private void insertInOrder(int element, int[] array, int begin, int end) {
        int index = end;  
        while ((index >= begin) && (element< array[index])) {
            array[index + 1] = array[index];
            index--;
        }
        array[index + 1] = element;
    }
	
	public <E extends Comparable<? super E>> void insertionSort(E[] array) {
        for (int i = 1; i < array.length; i++)
            insertInOrder(array[i], array, 0, i - 1);
    }

    private <E extends Comparable<? super E>> void insertInOrder(E element, E[] array, int begin, int end) {
        int index = end;  
        while ((index >= begin) && (element.compareTo(array[index]) < 0)) {
            array[index + 1] = array[index];
            index--;
        }
        array[index + 1] = element;
    }
}