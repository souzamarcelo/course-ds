package search;

import utils.Point;

public class SequentialSearch {
	
    public static void main(String[] args) {
        
    	int[] intArray = {4, 19, 1, 12, 4, 5, 9, 8, 33};
    	
        System.out.print("Array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");

		System.out.println("Position of element 19: " + indexOf(intArray, 19));
		System.out.println("Position of element 4: " + indexOf(intArray, 4));
		System.out.println("Position of element 25: " + indexOf(intArray, 25));
		
		
		
		Point[] pointArray = {
            new Point(1, 7),
            new Point(0, 0),
            new Point(6, 1),
            new Point(4, -3),
            new Point(-2, 12),
            new Point(4, 1)
        };

        System.out.print("\nGeneric array of points: [ ");
        for(Point p : pointArray)
            System.out.print(p + " ");
        System.out.println("]");

        System.out.println("Position of point (0, 0): " + indexOf(pointArray, new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + indexOf(pointArray, new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + indexOf(pointArray, new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + indexOf(pointArray, new Point(8, 8)));
		System.out.println();
	}
    
    public static int indexOf(int[] array, int value) {
		for(int i = 0; i < array.length; i++)
			if(array[i] == value)
				return i;
		
		return -1;
	}
	
	public static int indexOf(String[] array, String value) {
		for(int i = 0; i < array.length; i++)
			if(array[i].equals(value))
				return i;
		
		return -1;
	}

	public static <E> int indexOf(E[] array, E value) {
		for(int i = 0; i < array.length; i++)
			if(array[i].equals(value))
				return i;
		return -1;
	}

    public static int indexOf_sorted(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value)
				return i;
			if(array[i] < value)
				return -1;
		}
		return -1;
	}
}