package search.binary;

import utils.Point;

import java.util.Comparator;

import list.ArrayList;
import list.List;

public class TestBinarySearch {
	
    static SimpleBinarySearch simpleSearch = new SimpleBinarySearch();
    static GenericBinarySearch<Point> genericSearch = new GenericBinarySearch<>(new PointComparator());

	public static void main(String[] args) {
		int[] intArray = {1, 4, 4, 5, 8, 9, 12, 19, 33};
        System.out.print("Array of integers: [ ");
        for(int i : intArray)
            System.out.print(i + " ");
        System.out.println("]");
        
		System.out.println("Position of element 19: " + simpleSearch.search(intArray, 19));
		System.out.println("Position of element 4: " + simpleSearch.search(intArray, 4));
		System.out.println("Position of element 25: " + simpleSearch.search(intArray, 25));
		
		List<String> stringArray = new ArrayList<>();
        stringArray.add(stringArray.size(), "Argentina");
        stringArray.add(stringArray.size(), "Brasil");
        stringArray.add(stringArray.size(), "Canadá");
        stringArray.add(stringArray.size(), "França");
        stringArray.add(stringArray.size(), "Japão");
        System.out.println("Arraylist of strings: " + stringArray);
		System.out.println("Position of element Japão: " + simpleSearch.search(stringArray, "Japão"));
		System.out.println("Position of element Argentina: " + simpleSearch.search(stringArray, "Argentina"));
		System.out.println("Position of element Portugal: " + simpleSearch.search(stringArray, "Portugal"));
		System.out.println();
		
		Point[] pointArray = {
            new Point(-2, 12),
            new Point(0, 0),
            new Point(1, 7),
            new Point(4, -3),
            new Point(4, 1),
            new Point(6, 1),
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
        pointArrayList.add(pointArrayList.size(), new Point(-2, 12));
        pointArrayList.add(pointArrayList.size(), new Point(0, 0));
        pointArrayList.add(pointArrayList.size(), new Point(1, 7));
        pointArrayList.add(pointArrayList.size(), new Point(4, -3));
        pointArrayList.add(pointArrayList.size(), new Point(4, 1));
        pointArrayList.add(pointArrayList.size(), new Point(6, 1));

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
