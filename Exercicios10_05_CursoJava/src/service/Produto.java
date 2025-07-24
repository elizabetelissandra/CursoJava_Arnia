package service;

public class Produto {
	
	private String nome;
	private double valorUnitario;
	private int qtdComprada;
	
	public Produto(String nome, double valorUnitario, int qtdComprada) {
		super();
		this.nome = nome;
		this.valorUnitario = valorUnitario;
		this.qtdComprada = qtdComprada;
	}

	public double calcularTotal() {
		return valorUnitario * qtdComprada;
	}
	
	public double calcularComDesconto10() {
		return calcularTotal() * 0.90; 
	}
	
	public double calcularComDesconto20() {
		return calcularTotal() * 0.80;
	}
	
}
