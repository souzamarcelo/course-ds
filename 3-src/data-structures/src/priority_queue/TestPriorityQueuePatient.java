package priority_queue;

public class TestPriorityQueuePatient {
	
	//static PriorityQueue<Integer, String> pq = new ArrayPriorityQueue<>();
	static PriorityQueue<Paciente, Paciente> pq = new ArrayPriorityQueue<>();
	
	public static void main(String[] args) {
		/*
		pq.insert(4, "Joey");
		pq.insert(1, "Monica");
		pq.insert(6, "Ross");
		System.out.println(pq.toString());
		System.out.println(pq.min());
		
		pq.removeMin();
		System.out.println(pq.toString());
		
		pq.insert(2, "Chandler");
		pq.insert(8, "Phoebe");
		System.out.println(pq.toString());
		*/
		
		Paciente p1 = new Paciente("Ross", 10, 45);
		Paciente p2 = new Paciente("Joey", 8, 62);
		Paciente p3 = new Paciente("Rachel", 14, 21);
		Paciente p4 = new Paciente("Monica", 21, 88);
		
		pq.insert(p1, p1);
		pq.insert(p2, p2);
		pq.insert(p3, p3);
		pq.insert(p4, p4);
		System.out.println(pq.toString());
	}
	
	public static class Paciente implements Comparable<Paciente> {
		public String nome;
		public int horaChegada;
		public int idade;
		
		public Paciente(String nome, int horaChegada, int idade) {
			this.nome = nome;
			this.horaChegada = horaChegada;
			this.idade = idade;
		}
		
		public String toString() {
			return "<" + this.nome + "|" + this.horaChegada + "|" + this.idade + ">";
		}
		
		@Override
		public int compareTo(Paciente o) {
			if((this.idade >= 60) && (o.idade < 60)) return -1;
			if((this.idade < 60) && (o.idade >= 60)) return 1;
			if((this.horaChegada < o.horaChegada)) return -1;
			if((this.horaChegada > o.horaChegada)) return 1;
			return 0;
		}
	}
}
