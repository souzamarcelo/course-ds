package list;

import utils.Point;

public class TestList {
	//static List<Point> list = new LinkedList<>(); 
	static List<Point> list = new ArrayList<>(); 
	
	public static void main(String[] args) {
		System.out.println("Adicionando quatro elementos na lista...");
		list.add(0, new Point(0, 0));
		list.add(0, new Point(3, -7));
		list.add(2, new Point(8, 5));
		list.add(2, new Point(2, 4));

		System.out.println("Lista: " + list.toString());
		System.out.println("Tamanho: " + list.size());
		System.out.println("Vazia? " + list.isEmpty());
		
		System.out.println("Setando um novo elemento na posição 1: " + list.set(1, new Point(9, 9)));
		System.out.println("Lista: " + list.toString());
		System.out.println("Removendo o elemento da posição 2: " + list.remove(2));
		System.out.println("Lista: " + list.toString());
		System.out.println("Acessando o elemento da posição 1: " + list.get(1));
	}
}
