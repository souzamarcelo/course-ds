package queue;

import utils.Point;

public class TestQueue {
    static ArrayQueue<Point> queue = new ArrayQueue<>(5); 
    //static LinkedQueue<Point> queue = new LinkedQueue<>(); 
	
	public static void main(String[] args) {
        System.out.println("Enfileirando quatro elementos...");
		queue.enqueue(new Point(0, 0));
		queue.enqueue(new Point(4, -1));
		queue.enqueue(new Point(6, 1));
		queue.enqueue(new Point(-8, 9));

		System.out.println("Fila: " + queue.toString());
		System.out.println("Desenfileirando o elemento: " + queue.dequeue().toString());
		System.out.println("Primeiro da fila: " + queue.first().toString());
		System.out.println("Fila: " + queue.toString());
		System.out.println("Tamanho: " + queue.size());
		System.out.println("Vazia? " + queue.isEmpty());

        System.out.println("Desenfileirando três elementos...");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println("Vazia? " + queue.isEmpty());
		
		System.out.println("Enfileirando quatro elementos...");
		queue.enqueue(new Point(12, 7));
		queue.enqueue(new Point(4, -1));
		queue.enqueue(new Point(3, 0));
		queue.enqueue(new Point(-6, 0));

        System.out.println("Desenfileirando dois elementos...");
		queue.dequeue();
		queue.dequeue();

        System.out.println("Enfileirando dois elementos...");
		queue.enqueue(new Point(7, 1));
		queue.enqueue(new Point(7, -2));
		System.out.println("Fila: " + queue.toString());
		
        System.out.println("Desenfileirando dois elementos...");
        queue.dequeue();
		queue.dequeue();

        System.out.println("Enfileirando dois elementos...");
		queue.enqueue(new Point(2, 2));
		queue.enqueue(new Point(10, 8));
		System.out.println("Fila: " + queue.toString());
	}
}
