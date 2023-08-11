package base;

import utils.Point;

public class TestSinglyLinkedList {

    static SinglyLinkedList<Point> list = new SinglyLinkedList<>(); 

    public static void main(String[] args) {
        list.addFirst(new Point(2, 4));
        list.addFirst(new Point(7, 0));
        list.addFirst(new Point(-1, 6));
        list.addFirst(new Point(3, 5));
		System.out.println(list.toString());
		System.out.println(list.first().toString());
		System.out.println(list.last().toString());
		list.removeFirst();
		System.out.println(list.toString());
		System.out.println(list.size());
    }
}