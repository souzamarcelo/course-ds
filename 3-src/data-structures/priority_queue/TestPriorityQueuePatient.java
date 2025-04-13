package priority_queue;

public class TestPriorityQueuePatient {
	
	//static PriorityQueue<Integer, String> pq = new ArrayPriorityQueue<>();
	static PriorityQueue<Paciente> pq = new ArrayPriorityQueue<>();
	
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Ross", 10, 45);
		Paciente p2 = new Paciente("Joey", 8, 62);
		Paciente p3 = new Paciente("Rachel", 14, 21);
		Paciente p4 = new Paciente("Monica", 21, 88);
		
		pq.insert(p1);
		pq.insert(p2);
		pq.insert(p3);
		pq.insert(p4);
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
