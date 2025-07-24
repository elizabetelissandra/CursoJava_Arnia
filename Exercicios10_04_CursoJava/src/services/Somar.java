package services;

import interfaces.OperacaoMatematica;

public class Somar implements OperacaoMatematica{

	private double numero1;
	private double numero2;
	
	public Somar(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}



	public double calcular() {
		return numero1 + numero2;
	}
	
}
