package service;

public class Quadrado extends Forma{

	private double lado;
	
	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
		// TODO Auto-generated constructor stub
	}

	public double calcularArea() {
		return lado * lado;
	}
	
}
