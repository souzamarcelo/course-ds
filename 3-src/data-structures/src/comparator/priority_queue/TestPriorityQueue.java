package comparator.priority_queue;

import java.util.Comparator;
import utils.Point;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		System.out.println();

		System.out.println("Teste usando uma chave primitiva (Integer)...");
		PriorityQueue<Integer, Point> priorityQueue = new ArrayPriorityQueue<>();
		
		System.out.println("Inserindo quatro entradas...");
		priorityQueue.insert(7, new Point(1, 0));
		priorityQueue.insert(5, new Point(2, 4));
		priorityQueue.insert(12, new Point(-1, 7));
		priorityQueue.insert(2, new Point(4, 12));

		System.out.println("Fila de prioridades: " + priorityQueue.toString());
		System.out.println("Min (entrada prioritária): " + priorityQueue.min());
		System.out.println("Removendo a entrada prioritária: " + priorityQueue.removeMin());
		System.out.println("Fila de prioridades: " + priorityQueue.toString());

		System.out.println("Inserindo uma entrada...");
		priorityQueue.insert(6, new Point(2, -3));

		System.out.println("Removendo a entrada prioritária: " + priorityQueue.removeMin());
		System.out.println("Fila de prioridades: " + priorityQueue.toString());
		System.out.println("\n\n");
		
		
		System.out.println("Teste usando uma chave criada (MyKey) e um comparador (MyKeyComparator)...");
		PriorityQueue<MyKey, Point> otherPriorityQueue = new ArrayPriorityQueue<>(new MyKeyComparator());

		System.out.println("Inserindo quatro entradas...");
		otherPriorityQueue.insert(new MyKey('A', 12), new Point(1, 0));
		otherPriorityQueue.insert(new MyKey('B', 2), new Point(2, 4));
		otherPriorityQueue.insert(new MyKey('A', 7), new Point(-1, 7));
		otherPriorityQueue.insert(new MyKey('B', 3), new Point(4, 12));
		
		System.out.println("Fila de prioridades: " + otherPriorityQueue.toString());
		System.out.println("Min (entrada prioritária): " + otherPriorityQueue.min());
		System.out.println("Removendo a entrada prioritária: " + otherPriorityQueue.removeMin());
		System.out.println("Fila de prioridades: " + otherPriorityQueue.toString());

		System.out.println("Inserindo uma entrada...");
		otherPriorityQueue.insert(new MyKey('A', 20), new Point(2, -3));


		System.out.println("Removendo a entrada prioritária: " + otherPriorityQueue.removeMin());
		System.out.println("Fila de prioridades: " + otherPriorityQueue.toString());

		System.out.println();
	}
	
	private static class MyKeyComparator implements Comparator<MyKey> {
		public int compare(MyKey a, MyKey b) {
			if(a.category == b.category) {
				if(a.value == b.value)
					return 0;
				else if(a.value < b.value)
					return -1;
				else
					return 1;
			} else if(a.category == 'A')
				return -1;
			else
				return 1;
		}
	}

	private static class MyKey implements Comparable<MyKey> {
		char category; // 'A' or 'B'
		int value;

		public MyKey(char _category, int _value) {
			category = _category;
			value = _value;
		}
		
		public String toString() {
			return "<" + category + "; " + value + ">";
		}

		public int compareTo(MyKey o) {
			if(this.category == o.category) {
				if(this.value == o.value)
					return 0;
				else if(this.value < o.value)
					return -1;
				else
					return 1;
			} else if(this.category == 'A')
				return -1;
			else
				return 1;
		}
	}
}
