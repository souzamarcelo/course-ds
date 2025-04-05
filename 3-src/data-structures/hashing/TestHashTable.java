package hashing;

import java.util.Hashtable;

public class TestHashTable {
	static Hashtable<Integer, String> cidades = new Hashtable<>(10);
	static Hashtable<Matricula, Estudante> estudantes = new Hashtable<>(100);
	
	public static void main(String[] args) {
		cidades.put(100, "Florianópolis");
		cidades.put(188, "Joinville");
		cidades.put(323, "Blumenau");
		cidades.put(474, "Chapecó");
		cidades.put(518, "Rio do Sul");
		
		System.out.println(cidades);
		cidades.remove(323);
		System.out.println(cidades.get(518));
		
		for(Integer key : cidades.keySet())
			System.out.println(key + "(" + key.hashCode() % 10 + "): " + cidades.get(key));
		
		System.out.println("\n");
		
		Estudante e1 = new Estudante("523-1247", "Ross", 3, 8.9);
		Estudante e2 = new Estudante("523-3761", "Monica", 7, 9.8);
		Estudante e3 = new Estudante("523-8147", "Rachel", 2, 8.2);
		Estudante e4 = new Estudante("523-0158", "Joey", 4, 7.1);
		Estudante e5 = new Estudante("523-6358", "Chandler", 9, 7.6);
		estudantes.put(e1.getMatricula(), e1);
		estudantes.put(e2.getMatricula(), e2);
		estudantes.put(e3.getMatricula(), e3);
		estudantes.put(e4.getMatricula(), e4);
		estudantes.put(e5.getMatricula(), e5);
		
		System.out.println(estudantes);
		estudantes.remove(new Matricula("523-6358"));
		System.out.println(estudantes.get(new Matricula("523-8147")));
		
		for(Matricula key : estudantes.keySet())
			System.out.println(key + "(" + key.hashCode() % 100 + "): " + estudantes.get(key));
	}
	
	public static class Matricula {
		private String matricula;
		
		public Matricula(String matricula) {
			this.matricula = matricula;
		}
		
		@Override
		public int hashCode() {
			return Integer.parseInt(matricula.substring(4));
		}
		
		@Override
		public boolean equals(Object o) {
			if(o.getClass() != this.getClass()) return false;
			Matricula other = (Matricula) o;
			return this.matricula.equals(other.getMatricula());
		}
		
		public String toString() {
			return this.matricula;
		}
		
		public String getMatricula() {
			return this.matricula;
		}
	}
	
	public static class Estudante {
		private Matricula matricula;
		private String nome;
		private int fase;
		private double media;
		
		public Estudante(String matricula, String nome, int fase, double media) {
			this.matricula = new Matricula(matricula);
			this.nome = nome;
			this.fase = fase;
			this.media = media;
		}
		
		public String toString() {
			return "[" + this.nome + "|" + this.fase + "|" + this.media + "]";
 		}
		
		public Matricula getMatricula() {
			return matricula;
		}
		public int getFase() {
			return fase;
		}
		public void setFase(int fase) {
			this.fase = fase;
		}
		public double getMedia() {
			return media;
		}
		public void setMedia(double media) {
			this.media = media;
		}
	}
}
