package priority_queue;

/*
 * Exercício da lista
 */

public class TestPriorityQueueName {
		
	static PriorityQueue<Name> pq = new ArrayPriorityQueue<>();
	
	public static void main(String[] args) {
		pq.insert(new Name("Phoebe"));
		pq.insert(new Name("Joey"));
		pq.insert(new Name("Ross"));
		System.out.println(pq.min());
		pq.insert(new Name("Rachel"));
		System.out.println(pq.removeMin());
		System.out.println(pq.removeMin());
		System.out.println(pq.min());
		pq.insert(new Name("Monica"));
		System.out.println(pq.removeMin());
		System.out.println(pq.toString());
	}
	
	public static class Name implements Comparable<Name> {
		public String value;
		
		public Name(String value) {
			this.value = value;
		}
		
		@Override
		public int compareTo(Name o) {
			//return this.value.length() - o.value.length();
			return this.value.compareTo(o.value);
		}
		
		public String toString() {
			return this.value;
		}
	}
}