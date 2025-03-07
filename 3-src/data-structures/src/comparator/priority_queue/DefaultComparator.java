package comparator.priority_queue;

import java.util.Comparator;

public class DefaultComparator<E> implements Comparator<E> {
	@SuppressWarnings("unchecked")
	public int compare(E a, E b) {
		return ((Comparable<E>) a).compareTo(b);
	}
}
