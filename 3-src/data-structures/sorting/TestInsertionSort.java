package sorting;

import utils.Point;

public class TestInsertionSort {
	
    static InsertionSort sort = new InsertionSort();
    
	public static void main(String[] args) {
        Integer[] intArray = {4, 19, 1, 12, 4, 5, 9, 8, 33};
        
        System.out.print("Array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");

		System.out.println("Sorting...");
        sort.insertionSort(intArray);

        System.out.print("Sorted array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");
        System.out.println();


        Point[] pointArray = {
            new Point(1, 7),
            new Point(0, 0),
            new Point(6, 1),
            new Point(4, -3),
            new Point(-2, 12),
            new Point(4, 1)
        };

        System.out.print("Generic array of points: [ ");
        for(Point p : pointArray)
            System.out.print(p + " ");
        System.out.println("]");

        System.out.println("Sorting...");
        sort.insertionSort(pointArray);

        System.out.print("Sorted generic array of points: [ ");
        for(Point p : pointArray)
            System.out.print(p + " ");
        System.out.println("]");
        System.out.println();
	}
}
