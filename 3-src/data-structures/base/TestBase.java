package base;

import utils.Point;

public class TestBase {
	
	//static DoublyLinkedList<Point> list = new DoublyLinkedList<>(); 
	//static CircularlyLinkedList<Point> list = new CircularlyLinkedList<>(); 
	static SinglyLinkedList<Point> list = new SinglyLinkedList<>(); 
    
	public static void main(String[] args) {
		System.out.println("Adicionando elementos...");
        list.addFirst(new Point(2, 4));
        list.addFirst(new Point(7, 0));
        list.addFirst(new Point(-1, 6));
        list.addLast(new Point(3, 5));
		
        System.out.println("Lista atual: " + list.toString());
        System.out.println("Primeiro elemento: " + list.first().toString());
		System.out.println("Último elemento: " + list.last().toString());
		
        System.out.println("Removendo o primeiro elemento...");
        list.removeFirst();
		
        System.out.println("Lista atual: " + list.toString());
		System.out.println("Tamanho da lista: " + list.size());
	}
}
