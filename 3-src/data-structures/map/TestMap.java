package map;

public class TestMap {
	
	static Map<Word, Content> map = new UnsortedArrayMap<>();
	//static Map<Word, Content> map = new SortedArrayMap<>();
	
	public static void main(String[] args) {
		map.put(new Word("computer"), new Content("an electronic machine", "noun"));
		map.put(new Word("beautiful"), new Content("very attractive", "adjective"));
		map.put(new Word("car"), new Content("a road vehicle", "noun"));
		map.put(new Word("table"), new Content("a flat surface", "noun"));
		map.put(new Word("listen"), new Content("to give attention", "verb"));
		
		System.out.println(map.toString());
		System.out.println(map.get(new Word("car")));
		System.out.println(map.put(new Word("car"), new Content("a nonsense description", "verb")));
		System.out.println(map.get(new Word("car")));
		System.out.println(map.toString());
		System.out.println(map.remove(new Word("beautiful")));
		System.out.println(map.toString());
	}
	
	private static class Content {
		String description;
		String category;
		
		public Content(String d, String c) {
			description = d;
			category = c;
		}
		
		public String toString() {
			return "[" + category + "] " + description; 
		}
	}
	
	private static class Word implements Comparable<Word> {

		String term;
		
		public Word(String t) {
			term = t;
		}
		
		public int compareTo(Word o) {
			return term.compareTo(o.term);
		}
		
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			Word other = (Word) obj;
			if (term == null) {
				if (other.term != null)
					return false;
			} else if (!term.equals(other.term))
				return false;
			return true;
		}

		public String toString() {
			return term;
		}
	}
}
