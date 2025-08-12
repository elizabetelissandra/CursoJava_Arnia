package service;

public class Pessoas implements Comparable<Pessoas>{
	
	protected String nome;
	protected int idade;
	
	public Pessoas(String nome, int idade) {
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
	public int compareTo(Pessoas pessoa) {
		if (this.idade < pessoa.getIdade()) return -1;
	    if (this.idade > pessoa.getIdade()) return 1;
	    return this.nome.compareToIgnoreCase(pessoa.getNome());
	}

	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + "]";
	}



	
	
	

}
