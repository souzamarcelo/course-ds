package priority_queue;

public interface PriorityQueue<E> {
	int size();
	boolean isEmpty();
	void insert(E e);
	E min();
	E removeMin();
}