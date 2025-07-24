package service;

public abstract class Forma {

	private String nome;

	public Forma(String nome) {
		super();
		this.nome = nome;
	}
	
	public String exibirNome() {
		return nome;
	}
	
	public abstract double calcularArea();
}
