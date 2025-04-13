package priority_queue;

import utils.Point;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		System.out.println();

		PriorityQueue<Point> priorityQueue = new ArrayPriorityQueue<>();
		
		System.out.println("Inserindo quatro entradas...");
		priorityQueue.insert(new Point(1, 0));
		priorityQueue.insert(new Point(2, 4));
		priorityQueue.insert(new Point(-1, 7));
		priorityQueue.insert(new Point(4, 12));

		System.out.println("Fila de prioridades: " + priorityQueue.toString());
		System.out.println("Min (entrada prioritária): " + priorityQueue.min());
		System.out.println("Removendo a entrada prioritária: " + priorityQueue.removeMin());
		System.out.println("Fila de prioridades: " + priorityQueue.toString());

		System.out.println("Inserindo uma entrada...");
		priorityQueue.insert(new Point(2, -3));

		System.out.println("Removendo a entrada prioritária: " + priorityQueue.removeMin());
		System.out.println("Fila de prioridades: " + priorityQueue.toString());
		System.out.println("\n\n");
	}
}
