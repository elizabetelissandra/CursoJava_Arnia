package service;

public abstract class Produto {

	protected String nome;
	protected double preco;
	
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String exibirNome() {
		return "Nome: "+nome;
	}
	
	public abstract double valorTotal();
	
}
