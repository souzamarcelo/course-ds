package sorting;

import utils.Point;

import java.util.Comparator;

import list.ArrayList;
import list.LinkedList;
import list.List;

public class TestInsertionSort {
	
    static InsertionSort<Point> sortPoints = new InsertionSort<>(new PointComparator());
    static InsertionSort<Integer> sortInts = new InsertionSort<>();
    static InsertionSort<String> sortStrings = new InsertionSort<>();

	public static void main(String[] args) {
        Integer[] intArray = {4, 19, 1, 12, 4, 5, 9, 8, 33};
        
        System.out.print("Array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");

		System.out.println("Sorting...");
        sortInts.insertionSort(intArray);

        System.out.print("Sorted array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");

        System.out.println();


        List<String> stringList = new LinkedList<>();
        stringList.add(stringList.size(), "Brasil");
        stringList.add(stringList.size(), "Japão");
        stringList.add(stringList.size(), "Argentina");
        stringList.add(stringList.size(), "França");
        stringList.add(stringList.size(), "Canadá");
        
        System.out.println("LinkedList of strings: " + stringList);

        System.out.println("Sorting...");
        sortStrings.insertionSort(stringList);

        System.out.println("Sorted LinkedList of strings: " + stringList);

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
        sortPoints.insertionSort(pointArray);

        System.out.print("Sorted generic array of points: [ ");
        for(Point p : pointArray)
            System.out.print(p + " ");
        System.out.println("]");

        System.out.println();


		List<Point> pointArrayList = new ArrayList<>();
        pointArrayList.add(pointArrayList.size(), new Point(1, 7));
        pointArrayList.add(pointArrayList.size(), new Point(-2, 12));
        pointArrayList.add(pointArrayList.size(), new Point(6, 1));
        pointArrayList.add(pointArrayList.size(), new Point(4, -3));
        pointArrayList.add(pointArrayList.size(), new Point(0, 0));
        pointArrayList.add(pointArrayList.size(), new Point(4, 1));

        System.out.println("Generic Arraylist of points: " + pointArrayList);

        System.out.println("Sorting...");
        sortPoints.insertionSort(pointArrayList);

        System.out.println("Sorted generic Arraylist of points: " + pointArrayList);

        System.out.println();
	}

	private static class PointComparator implements Comparator<Point> {
		public int compare(Point a, Point b) {
			if(a.getX() == b.getX()) return ((int) a.getY() - (int) b.getY());
            return ((int) a.getX() - (int) b.getX());
		}
	}
}
