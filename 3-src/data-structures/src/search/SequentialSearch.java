package search;

import utils.Point;

import list.List;
import list.ArrayList;
import list.LinkedList;

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
		
		List<String> stringList = new LinkedList<>();
        stringList.add(stringList.size(), "Brasil");
        stringList.add(stringList.size(), "Japão");
        stringList.add(stringList.size(), "Argentina");
        stringList.add(stringList.size(), "França");
        stringList.add(stringList.size(), "Canadá");

        System.out.println("LinkedList of strings: " + stringList);
		System.out.println("Position of element Japão: " + stringList.indexOf("Japão"));
		System.out.println("Position of element Argentina: " + stringList.indexOf("Argentina"));
		System.out.println("Position of element Portugal: " + stringList.indexOf("Portugal"));
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

        System.out.println("Position of point (0, 0): " + indexOf(pointArray, new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + indexOf(pointArray, new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + indexOf(pointArray, new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + indexOf(pointArray, new Point(8, 8)));
		System.out.println();

        List<Point> pointArrayList = new ArrayList<>();
        pointArrayList.add(pointArrayList.size(), new Point(1, 7));
        pointArrayList.add(pointArrayList.size(), new Point(-2, 12));
        pointArrayList.add(pointArrayList.size(), new Point(6, 1));
        pointArrayList.add(pointArrayList.size(), new Point(4, -3));
        pointArrayList.add(pointArrayList.size(), new Point(0, 0));
        pointArrayList.add(pointArrayList.size(), new Point(4, 1));

        System.out.println("Generic Arraylist of points: " + pointArrayList);
        System.out.println("Position of point (0, 0): " + pointArrayList.indexOf(new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + pointArrayList.indexOf(new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + pointArrayList.indexOf(new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + pointArrayList.indexOf(new Point(8, 8)));
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