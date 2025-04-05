package deque;

import utils.Point;

public class TestDeque {

	//static ArrayDeque<Point> deque = new ArrayDeque<>(5); 
	static LinkedDeque<Point> deque = new LinkedDeque<>();
	
	public static void main(String[] args) {
		System.out.println("Adicionando quatro elementos...");
		deque.addFirst(new Point(1, 8));
		deque.addFirst(new Point(7, -2));
		deque.addLast(new Point(6, 1));
		deque.addLast(new Point(0, 10));

		System.out.println("Deque: " + deque.toString());
		System.out.println("Primeiro elemento: " + deque.first());
		System.out.println("Último elemento: " + deque.last());
		System.out.println("Removendo o primeiro elemento: " + deque.removeFirst());
		System.out.println("Removendo o último elemento: " + deque.removeLast());
		
		System.out.println("Adicionando dois elementos...");
		deque.addLast(new Point(4, 4));
		deque.addFirst(new Point(-1, 5));

		System.out.println("Deque: " + deque.toString());
		System.out.println("Tamanho: " + deque.size());
		System.out.println("Vazio? " + deque.isEmpty());
	}
}
