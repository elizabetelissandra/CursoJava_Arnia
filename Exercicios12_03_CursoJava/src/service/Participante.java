package service;

import java.util.Comparator;

public class Participante implements Comparable<Participante> {

	protected String nome;
	protected int idade;
	
	public Participante(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Participante o) {
		if (this.idade < o.getIdade()) return -1;
	    if (this.idade > o.getIdade()) return 1;
	    return o.nome.compareToIgnoreCase(o.getNome());
	}

	@Override
	public String toString() {
		return "Participante [nome = " + nome + ", idade = " + idade + "]";
	}
	
	
	

}
