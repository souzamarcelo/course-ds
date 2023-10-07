package search;

import utils.Point;
import list.ArrayList;

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
		
		ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add(stringArray.size(), "Argentina");
        stringArray.add(stringArray.size(), "Brasil");
        stringArray.add(stringArray.size(), "Canadá");
        stringArray.add(stringArray.size(), "França");
        stringArray.add(stringArray.size(), "Japão");
        System.out.println("Arraylist of strings: " + stringArray);
		
        System.out.println("Position of element Japão: " + indexOf(stringArray, "Japão"));
		System.out.println("Position of element Argentina: " + indexOf(stringArray, "Argentina"));
		System.out.println("Position of element Portugal: " + indexOf(stringArray, "Portugal"));
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

        System.out.println("Position of point (0, 0): " + indexOf(pointArray, new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + indexOf(pointArray, new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + indexOf(pointArray, new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + indexOf(pointArray, new Point(8, 8)));
		System.out.println();

        ArrayList<Point> pointArrayList = new ArrayList<>();
        pointArrayList.add(pointArrayList.size(), new Point(-2, 12));
        pointArrayList.add(pointArrayList.size(), new Point(0, 0));
        pointArrayList.add(pointArrayList.size(), new Point(1, 7));
        pointArrayList.add(pointArrayList.size(), new Point(4, -3));
        pointArrayList.add(pointArrayList.size(), new Point(4, 1));
        pointArrayList.add(pointArrayList.size(), new Point(6, 1));

        System.out.println("Generic Arraylist of points: " + pointArrayList);
        System.out.println("Position of point (0, 0): " + indexOf(pointArrayList, new Point(0, 0)));
        System.out.println("Position of point (4, 1): " + indexOf(pointArrayList, new Point(4, 1)));
        System.out.println("Position of point (4, 3): " + indexOf(pointArrayList, new Point(4, 3)));
        System.out.println("Position of point (8, 8): " + indexOf(pointArrayList, new Point(8, 8)));
		System.out.println();
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
	
	public static <E extends Comparable<? super E>> int indexOf(ArrayList<E> list, E value) {
		int low = 0;
		int high = list.size() - 1;
		int mid;
		
		do {
			mid = (low + high) / 2;
			if(list.get(mid).compareTo(value) < 0)
				low = mid + 1;
			else
				high = mid - 1;
			
		} while(list.get(mid).compareTo(value) != 0 && low <= high);
		
		if(list.get(mid).compareTo(value) == 0)
			return mid;
		else
			return -1;
	}
}