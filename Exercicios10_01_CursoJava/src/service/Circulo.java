package service;

public class Circulo extends Forma {
	
	private double raio;

	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2);
	}
	
	

}
