package list;

public interface List<E> {
	int size();
	boolean isEmpty();
	E get(int i);
	E set(int i, E e);
	void add(int i, E e);
	E remove(int i);
	int indexOf(E e);
}
