package search;

import utils.Point;

public class BinarySearch {
	
    public static void main(String[] args) {
		
    	int[] intArray = {1, 4, 4, 5, 8, 9, 12, 19, 33};
        
    	System.out.print("Array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");
        
		System.out.println("Position of element 19: " + indexOf(intArray, 19));
		System.out.println("Position of element 4: " + indexOf(intArray, 4));
		System.out.println("Position of element 25: " + indexOf(intArray, 25));
		
		
		Point[] pointArray = {
            new Point(-2, 12),
            new Point(0, 0),
            new Point(1, 7),
            new Point(4, -3),
            new Point(4, 1),
            new Point(6, 1),
        };

        System.out.print("\nGeneric array of points: [ ");
        for(Point p : pointArray)
            System.out.print(p + " ");
        System.out.println("]");

        System.out.println("Position of point (0, 0): " + indexOf(pointArray, new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + indexOf(pointArray, new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + indexOf(pointArray, new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + indexOf(pointArray, new Point(8, 8)));
	}

	public static int indexOf(int[] array, int value) {
		int low = 0;
		int high = array.length - 1;
		int mid;
		
		do {
			mid = (low + high) / 2;
			if(array[mid] < value)
				low = mid + 1;
			else
				high = mid - 1;
			
		} while(array[mid] != value && low <= high);
		
		if(array[mid] == value)
			return mid;
		else
			return -1;
	}
	
	public static int indexOf(String[] array, String value) {
		int low = 0;
		int high = array.length - 1;
		int mid;
		
		do {
			mid = (low + high) / 2;
			if(array[mid].compareTo(value) < 0)
				low = mid + 1;
			else
				high = mid - 1;
			
		} while(array[mid].compareTo(value) != 0 && low <= high);
		
		if(array[mid].compareTo(value) == 0)
			return mid;
		else
			return -1;
	}

    public static <E extends Comparable<? super E>> int indexOf(E[] array, E value) {
		int low = 0;
		int high = array.length - 1;
		int mid;
		
		do {
			mid = (low + high) / 2;
			if(array[mid].compareTo(value) < 0)
				low = mid + 1;
			else
				high = mid - 1;
			
		} while(array[mid].compareTo(value) != 0 && low <= high);
		
		if(array[mid].compareTo(value) == 0)
			return mid;
		else
			return -1;
	}
}