package search.sequential;

import utils.Point;

import java.util.Comparator;

import list.ArrayList;
import list.LinkedList;
import list.List;

public class TestSequentialSearch {
	
    static SimpleSequentialSearch simpleSearch = new SimpleSequentialSearch();
    static GenericSequentialSearch<Point> genericSearch = new GenericSequentialSearch<>(new PointComparator());

	public static void main(String[] args) {
        int[] intArray = {4, 19, 1, 12, 4, 5, 9, 8, 33};
        System.out.print("Array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");

		System.out.println("Position of element 19: " + simpleSearch.indexOf(intArray, 19));
		System.out.println("Position of element 4: " + simpleSearch.indexOf(intArray, 4));
		System.out.println("Position of element 25: " + simpleSearch.indexOf(intArray, 25));
		
		List<String> stringList = new LinkedList<>();
        stringList.add(stringList.size(), "Brasil");
        stringList.add(stringList.size(), "Japão");
        stringList.add(stringList.size(), "Argentina");
        stringList.add(stringList.size(), "França");
        stringList.add(stringList.size(), "Canadá");
        
        System.out.println("LinkedList of strings: " + stringList);
		System.out.println("Position of element Japão: " + simpleSearch.indexOf(stringList, "Japão"));
		System.out.println("Position of element Argentina: " + simpleSearch.indexOf(stringList, "Argentina"));
		System.out.println("Position of element Portugal: " + simpleSearch.indexOf(stringList, "Portugal"));
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

        System.out.println("Position of point (0, 0): " + genericSearch.indexOf(pointArray, new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + genericSearch.indexOf(pointArray, new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + genericSearch.indexOf(pointArray, new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + genericSearch.indexOf(pointArray, new Point(8, 8)));
		System.out.println();

        List<Point> pointArrayList = new ArrayList<>();
        pointArrayList.add(pointArrayList.size(), new Point(1, 7));
        pointArrayList.add(pointArrayList.size(), new Point(-2, 12));
        pointArrayList.add(pointArrayList.size(), new Point(6, 1));
        pointArrayList.add(pointArrayList.size(), new Point(4, -3));
        pointArrayList.add(pointArrayList.size(), new Point(0, 0));
        pointArrayList.add(pointArrayList.size(), new Point(4, 1));

        System.out.println("Generic Arraylist of points: " + pointArrayList);
        System.out.println("Position of point (0, 0): " + genericSearch.indexOf(pointArrayList, new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + genericSearch.indexOf(pointArrayList, new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + genericSearch.indexOf(pointArrayList, new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + genericSearch.indexOf(pointArrayList, new Point(8, 8)));
		System.out.println();
	}

	private static class PointComparator implements Comparator<Point> {
		public int compare(Point a, Point b) {
			if(a.getX() == b.getX()) return ((int) a.getY() - (int) b.getY());
            return ((int) a.getX() - (int) b.getX());
		}
	}
}
