package stack;

import utils.Point;

public class TestStack {
	
	static Stack<Point> stack = new ArrayStack<>(); 
	//static Stack<Point> stack = new LinkedStack<>();

	public static void main(String[] args) {
		System.out.println("Empilhando quatro elementos...");
		stack.push(new Point(1, -1));
		stack.push(new Point(0, 6));
		stack.push(new Point(9, 5));
		stack.push(new Point(-3, 8));

		System.out.println("Pilha: " + stack.toString());
		System.out.println("Empilhando um elemento: " + stack.pop().toString());
		System.out.println("Desempilhando outro elemento: " + stack.top().toString());
		System.out.println("Pilha: " + stack.toString());
		System.out.println("Tamanho: " + stack.size());
		System.out.println("Vazia? " + stack.isEmpty());
		
		System.out.println("Desempilhando três elementos...");
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println("Vazia? " + stack.isEmpty());
	}
}
